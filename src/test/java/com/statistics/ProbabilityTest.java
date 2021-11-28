package com.statistics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProbabilityTest {
    @Test
    public void shouldProbabilityTwoEventsIsEqual(){
        Probability probabilityGetHead = new Probability(0.5F);
        Probability probabilityGetTail = new Probability(0.5F);

        assertTrue(probabilityGetHead.equals(probabilityGetTail));
    }

    @Test
    public void shouldCheckProbabilityTwoEventsIsNotEqual(){
        Probability probabilityGetHead = new Probability(0.5F);
        Probability probabilityGetTail = new Probability(0.50F);

        assertFalse(probabilityGetHead.equals(probabilityGetTail));
    }

    public void shouldCalculateProbability_of_TwoIndependentEvents_Occurring_together(){
        Probability probabilityEventA = new Probability(0.9F);
        Probability probabilityEventB = new Probability(0.5F);

        assertTrue(new Probability((float)0.45).equals(probabilityEventA.eitherThisEventOrThatEventOccurred(probabilityEventB)));
    }

    @Test
    public void shouldCalculateProbabilityOfEventNotOccurred(){
        Probability probabilityEventA = new Probability(0.30F);

        assertTrue(new Probability(0.70F).equals(probabilityEventA.eventNotEqual()));
    }


    @Test
    public void shouldCalculateProbabilityOfEitherEventOccurred(){
        Probability probabilityEventA = new Probability(0.50F);
        Probability probabilityEventB = new Probability(0.50F);

        assertTrue(new Probability(0.75F).equals(probabilityEventA.eitherThisEventOrThatEventOccurred(probabilityEventB)));
    }
}
