package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when00to50then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when77to00then98() {
        double expected = 9.8;
        Point a = new Point(7, 7);
        Point b = new Point(0, 0);
        Assert.assertEquals(expected, a.distance(b), 0.1);
    }

    @Test
    public void when99to11then113() {
        double expected = 11.3;
        Point a = new Point(9, 9);
        Point b = new Point(1, 1);
        Assert.assertEquals(expected, a.distance(b), 0.1);
    }

    @Test
    public void when000to111then17() {
        double expected = 1.7;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        Assert.assertEquals(expected, a.distance3d(b), 0.1);
    }

    @Test
    public void when217to548then17() {
        double expected = 4.3;
        Point a = new Point(2, 1, 7);
        Point b = new Point(5, 4, 8);
        Assert.assertEquals(expected, a.distance3d(b), 0.1);
    }
}