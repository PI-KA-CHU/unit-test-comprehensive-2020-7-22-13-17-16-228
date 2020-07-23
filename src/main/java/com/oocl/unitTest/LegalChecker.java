package com.oocl.unitTest;

import java.util.HashSet;
import java.util.Set;

public class LegalChecker {

    public boolean checkIsLegal(int[] inputNumber) {
        if (inputNumber == null || inputNumber.length != 4) {
            return false;
        }

        Set<Integer> inputNumberSet = new HashSet<>();
        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] < 0 || inputNumber[i] > 9) {
                return false;
            }
            if (inputNumberSet.contains(inputNumber[i])) {
                return false;
            }
            inputNumberSet.add(inputNumber[i]);
        }
        return true;
    }
}
