package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To6Then6() {
        int left = 4;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when5Eq5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To6to8Then8() {
        int first = 4;
        int second = 6;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To5To13Then13() {
        int first = 8;
        int second = 5;
        int third = 13;
        int result = Max.max(first, second, third);
        int expected = 13;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2To9To12Then12() {
        int first = 5;
        int second = 2;
        int third = 9;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To8To3To1Then15() {
        int first = 15;
        int second = 8;
        int third = 3;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }
}