package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> inputGuess = Arrays.asList(1, 2, 3, 4);
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String result = guessNumber.guess(inputGuess, answerGenerator.generate());

        Assertions.assertEquals("4A0B", result);
    }

    @Test
    void should_return_2A2B_when_guess_given_answer_1234_and_input_guess_1243(){
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(1, 2, 4, 3);
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String result = guessNumber.guess(inputGuess, answerGenerator.generate());

        Assertions.assertEquals("2A2B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4321(){
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(4, 3, 2, 1);
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String result = guessNumber.guess(inputGuess, answerGenerator.generate());

        Assertions.assertEquals("0A4B", result);
    }

    @Test
    void should_return_1A1B_when_guess_given_answer_1234_and_input_guess_1562(){
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(1, 5, 6, 2);
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String result = guessNumber.guess(inputGuess, answerGenerator.generate());

        Assertions.assertEquals("1A1B", result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_1234_and_input_guess_2156(){
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(2, 1, 5, 6);
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String result = guessNumber.guess(inputGuess, answerGenerator.generate());

        Assertions.assertEquals("0A2B", result);
    }

    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678(){
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(5, 6, 7, 8);
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String result = guessNumber.guess(inputGuess, answerGenerator.generate());

        Assertions.assertEquals("0A0B", result);
    }
}
