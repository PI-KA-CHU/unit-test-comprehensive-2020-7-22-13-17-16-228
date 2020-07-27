package com.oocl.unitTest;

import java.util.Arrays;
import java.util.List;

public class RealAnswerGenerator implements AnswerGenerator {
    @Override
    public List<Integer> generate() {
        int length = 4;
        int maxNum = 9;
        int minNum = 0;
        Integer[] result = new Integer[length];
        Arrays.fill(result, 0);

        int count = 0;
        while(count < length) {
            int num = (int) (Math.random() * (maxNum - minNum)) + minNum;
            boolean flag = true;
            for (int j = 0; j < length; j++) {
                if(num == result[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result[count] = num;
                count++;
            }
        }
        return Arrays.asList(result);
    }
}
