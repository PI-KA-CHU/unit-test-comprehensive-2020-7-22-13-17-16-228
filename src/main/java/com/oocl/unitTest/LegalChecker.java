package com.oocl.unitTest;


import java.util.List;

public class LegalChecker {

    private final int INPUT_NUMBER_LENGTH = 4;
    private final int INPUT_NUMBER_MAX_RANGE = 9;
    private final int INPUT_NUMBER_MIN_RANGE = 0;

    public boolean checkIsLegal(List<Integer> inputNumber) {
        return inputNumber != null && checkInputLengthIsLegal(inputNumber)
                && checkInputNoRepeat(inputNumber) && checkInputRangeIsLegal(inputNumber);
    }

    private boolean checkInputLengthIsLegal(List<Integer> inputNumber) {
        return inputNumber.size() == INPUT_NUMBER_LENGTH;
    }

    private boolean checkInputNoRepeat(List<Integer> inputNumber) {
        return inputNumber.size() == inputNumber.stream().distinct().count();
    }

    private boolean checkInputRangeIsLegal(List<Integer> inputNumber) {
        return inputNumber.stream().noneMatch(num -> num < INPUT_NUMBER_MIN_RANGE || num > INPUT_NUMBER_MAX_RANGE);
    }
}
