package ru.job4j.condition;

import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslx = Math.pow((x2 - x1), 2);
        double rsly = Math.pow((y2 - y1), 2);
        double sum = rslx + rsly;
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(5, 4, 2, 7);
        System.out.println("result (5, 4) to (2, 7) " + result1);
        double result2 = Point.distance(3, 3, 1, 6);
        System.out.println("result (3, 3) to (1, 6) " + result2);
        double result3 = Point.distance(0, 1, 2, 5);
        System.out.println("result (0, 1) to (2, 5) " + result3);
    }
}

