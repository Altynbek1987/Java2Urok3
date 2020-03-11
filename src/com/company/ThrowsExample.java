package com.company;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            System.out.println("Факториал = ");
            getFactorial(-1);
        } catch (FactorialException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public static int getFactorial(int num) throws FactorialException {

        int result = 1;
        if (num < 0){
            throw new FactorialException("Ваше число меньше чeм 0", num);
        }
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }
        return result;
    }

}