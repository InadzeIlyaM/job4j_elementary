package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x1 - x2), 2);
        double second = Math.pow((y1 - y2), 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(0, 0, 0, 7);
        double result2 = Point.distance(0, 0, 8, 8);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 0) to (0, 7) " + result1);
        System.out.println("result (0, 0) to (8, 8) " + result2);
    }
}
