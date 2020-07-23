package com.oocl.unitTest;

public class RealAnswerGenerator implements AnswerGenerator {
    @Override
    public int[] generate() {
        int length = 4;
        int maxNum = 9;
        int minNum = 0;
        int[] result = new int[length];

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
        return result;
    }
}
