package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger x = BigInteger.valueOf(1);
        String result;
        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                x = x.multiply(BigInteger.valueOf(i));
            }
        } else if (n == 0){
            x = BigInteger.valueOf(1);
        } else {
            x = BigInteger.valueOf(0);
        }

        result = x.toString();

        return result;
    }
}
