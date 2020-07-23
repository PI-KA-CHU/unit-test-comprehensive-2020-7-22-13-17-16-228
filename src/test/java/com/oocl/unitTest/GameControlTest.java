package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GameControlTest {

    @Test
    void should_return_2A2B_when_play_game_given_input_guess_1234_answer_1234_remainintTime_4(){
        int remainingTimes = 4;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 3, 4};
        int[] answer = {1, 2, 4, 3};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String outputAfterPlayGame = gameControl.playGame(inputGuess,answerGenerator.generate());
        Assertions.assertEquals("2A2B\n",outputAfterPlayGame);
    }

    @Test
    void should_return_wrong_string_when_play_game_given_input_guess_1235_answer_1234_remainintTime_0(){
        int remainingTimes = 0;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 3, 5};
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String outputAfterPlayGame = gameControl.playGame(inputGuess,answerGenerator.generate());
        Assertions.assertEquals("Wrong Input，Input again\n",outputAfterPlayGame);
    }

    @Test
    void should_return_win_string_when_play_game_given_input_guess_1234_answer_1234_remainintTime_3(){
        int remainingTimes = 3;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 3, 4};
        int[] inputGuess2 = {1, 2, 3, 5};
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        answer = answerGenerator.generate();
        gameControl.playGame(inputGuess, answer);
        String outputAfterPlayGame = gameControl.playGame(inputGuess2, answer);
        Assertions.assertEquals("you are win!\n",outputAfterPlayGame);
    }
}
