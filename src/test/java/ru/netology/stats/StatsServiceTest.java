package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMiddleSumMonth() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.calculateMiddleSumMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMaxSale() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findMonthWithMaxSale(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMinSale() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findMonthWithMinSale(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityMonthWithSaleLowMiddle() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.findQuantityMonthWithSaleLowMiddle(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityMonthWithSaleHighMiddle() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.findQuantityMonthWithSaleHighMiddle(purchases);
        assertEquals(expected, actual);
    }
}