package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LegalCheckerTest {

    @Test
    void should_return_true_when_check_given_input_guess_1234(){
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 2, 3, 4);

        boolean isLegal = legalChecker.checkIsLegal(inputNumber);

        Assertions.assertTrue(isLegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_12345(){
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 2, 3, 4, 5);

        boolean islegal = legalChecker.checkIsLegal(inputNumber);

        Assertions.assertFalse(islegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_123(){
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 2, 3);

        boolean islegal = legalChecker.checkIsLegal(inputNumber);

        Assertions.assertFalse(islegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_1123(){
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 1, 2, 3);

        boolean islegal = legalChecker.checkIsLegal(inputNumber);

        Assertions.assertFalse(islegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_11023(){
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 10, 2, 3);

        boolean islegal = legalChecker.checkIsLegal(inputNumber);

        Assertions.assertFalse(islegal);
    }
}
