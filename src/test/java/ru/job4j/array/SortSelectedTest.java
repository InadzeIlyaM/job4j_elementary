package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{5, 10, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{5, 8, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{11, 2, 17, 4, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 10, 11, 17};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort7() {
        int[] data = new int[]{9, 5, 2, 21, 17, 8, 81};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 5, 8, 9, 17, 21, 81};
        assertThat(result).containsExactly(expected);
    }
}