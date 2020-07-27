package com.oocl.unitTest;


import java.util.List;

public class LegalChecker {

    public boolean checkIsLegal(List<Integer> inputNumber) {
        return inputNumber != null && checkInputLengthIsLegal(inputNumber)
                && checkInputNoRepeat(inputNumber) && checkInputRangeIsLegal(inputNumber);
    }

    private boolean checkInputLengthIsLegal(List<Integer> inputNumber) {
        return inputNumber.size() == 4;
    }

    private boolean checkInputNoRepeat(List<Integer> inputNumber) {
        return inputNumber.size() == inputNumber.stream().distinct().count();
    }

    private boolean checkInputRangeIsLegal(List<Integer> inputNumber) {
        return inputNumber.stream().noneMatch(num -> num < 0 || num > 9);
    }
}
