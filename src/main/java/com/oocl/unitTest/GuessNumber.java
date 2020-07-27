package com.oocl.unitTest;

import java.util.List;
import java.util.stream.IntStream;

public class GuessNumber {
    public String guess(List<Integer> inputGuess, List<Integer> answer) {

        int countNumberEqual = inputGuess.stream().filter(answer::contains).toArray().length;
        int countAllCurrent = IntStream
                .range(0, inputGuess.size())
                .filter(i -> inputGuess.get(i).equals(answer.get(i)))
                .toArray()
                .length;

        return String.format("%sA%sB",countAllCurrent,countNumberEqual - countAllCurrent);
    }
}
