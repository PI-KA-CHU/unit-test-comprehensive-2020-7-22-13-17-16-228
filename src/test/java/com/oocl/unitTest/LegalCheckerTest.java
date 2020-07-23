package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LegalCheckerTest {

    @Test
    void should_return_true_when_check_given_input_guess_1234(){
        LegalChecker legalChecker = new LegalChecker();
        int[] inputNumber = {1, 2, 3, 4};

        boolean islegal = legalChecker.checkIsLegal(inputNumber);

        Assertions.assertTrue(islegal);
    }
}