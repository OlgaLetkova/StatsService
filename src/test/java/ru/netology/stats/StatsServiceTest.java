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
        int monthWithMaxSale = service.findMonthWithMaxSale(purchases);
        System.out.println(monthWithMaxSale);
    }

    @Test
    void findMonthWithMinSale() {
        StatsService service = new StatsService();
        int monthWithMinSale = service.findMonthWithMinSale(purchases);
        System.out.println(monthWithMinSale);
    }

    @Test
    void findQuantityMonthWithSaleLowMiddle() {
        StatsService service = new StatsService();
        int quantityMonth = service.findQuantityMonthWithSaleLowMiddle(purchases);
        System.out.println(quantityMonth);
    }

    @Test
    void findQuantityMonthWithSaleHighMiddle() {
        StatsService service = new StatsService();
        int quantityMonth = service.findQuantityMonthWithSaleHighMiddle(purchases);
        System.out.println(quantityMonth);
    }
}