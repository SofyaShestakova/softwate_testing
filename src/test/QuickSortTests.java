package test;


import main.QuickSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


public class QuickSortTests {

    private int[] numbers;
    private final static int SIZE = 10;
    private final static int MAX = 20;

    @BeforeEach
    public void setUp() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }

    @Test
    public void testNull() {
        QuickSort sorter = new QuickSort();
        assertThrows(NullPointerException.class, () -> sorter.sort(null));
    }

    @Test
    public void testOneElement() {
        QuickSort sorter = new QuickSort();
        int[] test = new int[1];
        test[0] = 5;
        assertEquals(test, sorter.sort(test));
    }

    @Test
    public void testSpecialArray() {
        QuickSort sorter = new QuickSort();
        int[] test = {5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5, 1, 1};
        assertEquals(test, sorter.sort(test));
    }

    @Test
    public void testCorrectArray() {
        QuickSort sorter = new QuickSort();
        int[] test = {-35, -67, 99, 0, 1, 5, 73, 8, 9, 10};
        assertEquals(test, sorter.sort(test));
    }

    @Test
    public void testStringsArray() {
        QuickSort sorter = new QuickSort();
        String[] test = {"heyyy", "popoppo"};
        assertThrows(NumberFormatException.class, () -> sorter.sort(new int[]{Integer.parseInt(String.valueOf(test))}));
    }

}

