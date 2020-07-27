package com.oocl.unitTest;

import com.oocl.unitTest.enums.GameEnums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GameControlTest {

    private String WRONG_INPUT_MESSAGE = GameEnums.WRONG_INPUT.getMessage();
    private String WIN_GAME_MESSAGE = GameEnums.WIN_GAME.getMessage();
    private String FAIL_GAME_MESSAGE = GameEnums.FAIL_GAME.getMessage();

    // 正常的进行游戏的检测
    @Test
    void should_return_2A2B_when_play_game_given_input_guess_1234_answer_1234_remainintTime_4(){
        int remainingTimes = 4;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 3, 4};
        int[] answer = {1, 2, 4, 3};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String outputAfterPlayGame = gameControl.playGame(inputGuess,answerGenerator.generate());
        Assertions.assertEquals("2A2B",outputAfterPlayGame);
    }

    // 当没有剩余游戏次数时的检测
    @Test
    void should_return_wrong_string_when_play_game_given_input_guess_1235_answer_1234_remainintTime_0(){
        int remainingTimes = 0;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 3, 5};
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);

        String outputAfterPlayGame = gameControl.playGame(inputGuess,answerGenerator.generate());
        Assertions.assertEquals(FAIL_GAME_MESSAGE,outputAfterPlayGame);
    }

    // 当赢了游戏之后，再次进入游戏的检测
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
        Assertions.assertEquals(WIN_GAME_MESSAGE,outputAfterPlayGame);
    }

    // 检验启动游戏后的输入合法功能1 - 检验失败
    @Test
    void should_return_wrong_string_when_start_game_given_input_guess_12345_answer_1234_remainingTimes_3(){
        int remainingTimes = 3;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 3, 4, 5};
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        answer = answerGenerator.generate();

        String outputAfterPlayGame = gameControl.start(inputGuess, answer);
        Assertions.assertEquals(WRONG_INPUT_MESSAGE,outputAfterPlayGame);
    }

    // 检验启动游戏后的输入合法功能1 - 检验成功
    @Test
    void should_2A2B_string_when_start_game_given_input_guess_1243_answer_1234_remainingTimes_3(){
        int remainingTimes = 3;
        GameControl gameControl = new GameControl(remainingTimes);
        int[] inputGuess = {1, 2, 4, 3};
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(RealAnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        answer = answerGenerator.generate();

        String outputAfterPlayGame = gameControl.start(inputGuess, answer);
        Assertions.assertEquals("2A2B",outputAfterPlayGame);
    }
}






