package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static int minus(int a) {
        return a - x;
    }

    public static int sum(int e) {
        return e + x;
    }

    public int devide(int b) {
        return b / x;
    }

    public int multiply(int j) {
        return j * x;
    }

    public int sumAllOperation(int c) {
        return minus(c) + devide(c) + sum(c) + multiply(c);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int dev = calc.devide(10);
        int multi = calc.multiply(3);
        int min = minus(7);
        int sum = sum(7);
        int sumAll = calc.sumAllOperation(10);
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        System.out.println(dev);
        System.out.println(min);
        System.out.println(multi);
        System.out.println(sum);
        System.out.println(sumAll);
    }
}
