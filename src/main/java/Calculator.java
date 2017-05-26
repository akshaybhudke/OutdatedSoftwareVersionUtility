package com.main.calculator;

/**
 * Created by cts1 on 16/5/17.
 */
public class Calculator {
    public int evaluate( String expression ){
        int sum = 0;

        for(String summand : expression.split("\\+")){
            sum+=Integer.valueOf(summand);
        }

        return sum;
    }

    public int multiply(String expression) {

        int result = 1;

        for(String operand : expression.split(",")){
            result*=Integer.valueOf(operand);
        }

        return result;
    }
}
