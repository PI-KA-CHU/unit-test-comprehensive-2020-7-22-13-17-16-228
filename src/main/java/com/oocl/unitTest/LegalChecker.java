package com.oocl.unitTest;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LegalChecker {

    public boolean checkIsLegal(List<Integer> inputNumber) {
        return inputNumber != null && checkInputLengthIsLegal(inputNumber)
                && checkInputNoRepeat(inputNumber) && checkInputRangeIsLegal(inputNumber);
    }

    private boolean checkInputLengthIsLegal(List<Integer> inputNumber) {
        return inputNumber.size() == 4;
    }

    private boolean checkInputNoRepeat(List<Integer> inputNumber) {
        Set<Integer> inputNumberSet = new HashSet<>();
        for (int num : inputNumber) {
            if (inputNumberSet.contains(num)) {
                return false;
            }
            inputNumberSet.add(num);
        }
        return true;
    }

    private boolean checkInputRangeIsLegal(List<Integer> inputNumber) {
        for (int num : inputNumber) {
            if (num < 0 || num > 9) {
                return false;
            }
        }
        return true;
    }
}
