package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testStatisticSaleSum() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.statisticSaleSum(sale);

        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStatisticSaleAverageMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.statisticSaleAverageMonth(sale);

        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStatisticSaleMax() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.statisticSaleMax(sale);

        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStatisticSaleMin() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.statisticSaleMin(sale);

        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStatisticMonthUnderAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.statisticMonthUnderAverage(sale);

        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStatisticMonthOverAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.statisticMonthOverAverage(sale);

        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}