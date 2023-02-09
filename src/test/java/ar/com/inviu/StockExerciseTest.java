package ar.com.inviu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockExerciseTest {
    @Test
    void testFirstExample() {
        int expected= 5;
        int [] prices = {7,1,5,3,6,4};
        int actual = StockExercise.maxProfit(prices);

        assertEquals(expected,actual);
    }

    @Test
    void testSecondExample() {
        int expected= 0;
        int [] prices = {7,6,4,3,1};
        int actual = StockExercise.maxProfit(prices);

        assertEquals(expected,actual);
    }

    @Test
    void testAllTheSamePrices() {
        int expected= 0;
        int [] prices = {10,10,10,10,10};
        int actual = StockExercise.maxProfit(prices);

        assertEquals(expected,actual);
    }

    @Test
    void testAll0Prices() {
        int expected= 0;
        int [] prices = {0,0,0,0,0};
        int actual = StockExercise.maxProfit(prices);

        assertEquals(expected,actual);
    }

    @Test
    void testOtherExample() {
        int expected= 7;
        int [] prices = {7,2,9,1,5,3,6,4};
        int actual = StockExercise.maxProfit(prices);

        assertEquals(expected,actual);
    }
}