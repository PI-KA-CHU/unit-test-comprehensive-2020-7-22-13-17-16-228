package com.oocl.unitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class GenerateAnswerTest {

    @Test
    public void should_return_true_when_generate_answer_given_no_input_test_is_repeated() {
        AnswerGenerator answerGenerator = new RealAnswerGenerator();
        int[] answer = answerGenerator.generate();
        boolean result = true;

        Set<Integer> answerSet = new HashSet<>();
        for (int num : answer) {
            if (answerSet.contains(num)) {
                result = false;
            }
            answerSet.add(num);
        }

        Assertions.assertTrue(result);
    }

}
