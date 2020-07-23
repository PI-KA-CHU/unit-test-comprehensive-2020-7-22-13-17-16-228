package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GameControlTest {

    @Test
    void should_return_4A0B_when_play_game_given_input_guess_1234_answer_1234_remainintTime_4(){
        int remainingTimes = 4;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 3, 4};
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String outputAfterPlayGame = gameControl.playGame(inputGuess,answerGenerator.generate());
        Assertions.assertEquals("4A0B\n",outputAfterPlayGame);
    }
}
