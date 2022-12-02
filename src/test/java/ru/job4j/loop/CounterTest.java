package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTwentyTwoToTwentyEightThenOneHundred() {
        int start = 22;
        int finish = 28;
        int result = Counter.sumByEven(start, finish);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }
}
