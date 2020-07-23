package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1, 2, 3, 4};
        int[] inputGuess = {1, 2, 3, 4};

        String result = guessNumber.guess(inputGuess, answer);

        Assertions.assertEquals("4A0B", result);
    }

    @Test
    void should_return_2A2B_when_guess_given_answer_1234_and_input_guess_1256(){
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1, 2, 3, 4};
        int[] inputGuess = {1, 2, 5, 6};

        String result = guessNumber.guess(inputGuess, answer);

        Assertions.assertEquals("2A2B", result);
    }
}
