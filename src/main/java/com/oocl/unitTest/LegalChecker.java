package com.oocl.unitTest;

import java.util.HashSet;
import java.util.Set;

public class LegalChecker {

    public boolean checkIsLegal(int[] inputNumber) {
        return inputNumber != null && checkInputLengthIsLegal(inputNumber)
                && checkInputNoRepeat(inputNumber) && checkInputRangeIsLegal(inputNumber);
    }

    private boolean checkInputLengthIsLegal(int[] inputNumber) {
        return inputNumber.length == 4;
    }

    private boolean checkInputNoRepeat(int[] inputNumber) {
        Set<Integer> inputNumberSet = new HashSet<>();
        for (int num : inputNumber) {
            if (inputNumberSet.contains(num)) {
                return false;
            }
            inputNumberSet.add(num);
        }
        return true;
    }

    private boolean checkInputRangeIsLegal(int[] inputNumber) {
        for (int num : inputNumber) {
            if (num < 0 || num > 9) {
                return false;
            }
        }
        return true;
    }
}
