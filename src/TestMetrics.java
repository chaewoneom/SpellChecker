/**
* @author Chaewon Eom
* This document tests Metrics class.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TestMetrics {

    private Metrics metrics;

    @BeforeEach
    void setUp() {
    	metrics = new Metrics();
    }

    @Test
    void testGetCharacterCounts() {
        assertEquals(0, metrics.getCharacterCounts());
    }

    @Test
    void testGetLineCount() {
        assertEquals(0, metrics.getLineCount());
    }

    @Test
    void testGetWordCount() {
        assertEquals(0, metrics.getWordCount());
    }

    @Test
    void testGetCharacterCountsWithSpace() {
        assertEquals(0, metrics.getCharacterCountsWithSpace());
    }
    
    @Test
    void testSetCharacterCounts() {
    	metrics.setCharacterCounts(3);
    	
    	assertEquals(3, metrics.getCharacterCounts());
    }

    @Test
    void testIncrementMisSpelling() {
        metrics.incrementMisSpelling();
        assertEquals(1, metrics.getMisSpellingCounts());
    }

    @Test
    void testDecrementMisSpelling() {
        metrics.decreaseMisSpelling();
        assertEquals(-1, metrics.getMisSpellingCounts());
    }

    @Test
    void testIncrementMisCapitalization() {
        metrics.incrementMisCapitalization();
        assertEquals(1, metrics.getMisCapitalizationCounts());
    }

    @Test
    void testDecrementMisCapitalization() {
        metrics.decreaseMisCapitalization();
        assertEquals(-1, metrics.getMisCapitalizationCounts());
    }



    @Test
    void testIncrementManualCorrection() {
        metrics.incrementManualCorrection();
        assertEquals(1, metrics.getManualCorrectionsCounts());
    }

    @Test
    void testIncrementAcceptedSuggestion() {
        metrics.incrementAcceptedSuggestion();
        assertEquals(1, metrics.getAcceptedSuggestionCounts());
    }



    @Test
    void testGenerateReport() {
        String report = metrics.generateReport();
        assertNotNull(report);

    }
}

