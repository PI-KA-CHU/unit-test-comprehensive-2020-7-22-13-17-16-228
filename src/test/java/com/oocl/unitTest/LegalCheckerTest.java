package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LegalCheckerTest {

    @Test
    void should_return_true_when_check_given_input_guess_1234(){
        //given
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 2, 3, 4);

        //when
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);

        //then
        Assertions.assertTrue(isLegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_12345(){
        //given
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 2, 3, 4, 5);

        //when
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);

        //then
        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_123(){
        //given
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 2, 3);

        //when
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);

        //then
        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_1123(){
        //given
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 1, 2, 3);

        //when
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);

        //then
        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_false_when_check_given_input_guess_11023(){
        //given
        LegalChecker legalChecker = new LegalChecker();
        List<Integer> inputNumber = Arrays.asList(1, 10, 2, 3);

        //when
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);

        //then
        Assertions.assertFalse(isLegal);
    }
}
