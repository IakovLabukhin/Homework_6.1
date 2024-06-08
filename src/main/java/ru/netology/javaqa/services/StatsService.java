package ru.netology.javaqa.services;

public class StatsService {

    public long statisticSaleSum(long[] sale) {
        long sum = 0;
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public long statisticSaleAverageMonth(long[] sale) {
        int numberSale = sale.length;
        long sum = statisticSaleSum(sale);
        long averageMonth = sum / numberSale;
        return averageMonth;
    }

    public int statisticSaleMax(long[] sale) {
        int saleMax = (int) sale[0];

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[saleMax]) {
                saleMax = i;
            }
        }
        return saleMax + 1;
    }

    public int statisticSaleMin(long[] sale) {
        int saleMin = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[saleMin]) {
                saleMin = i;
            }
        }
        return saleMin + 1;
    }

    public int statisticMonthUnderAverage(long[] sale) {
        long averageSum = statisticSaleAverageMonth(sale);
        int numberUnderAverage = 0;

        for (int i = 0; i < sale.length; i++) {

            if (sale[i] < averageSum) {
                numberUnderAverage = numberUnderAverage + 1;
            }
        }
        return numberUnderAverage;
    }

    public int statisticMonthOverAverage(long[] sale) {
        long averageSum = statisticSaleAverageMonth(sale);
        int numberOverAverage = 0;

        for (int i = 0; i < sale.length; i++) {

            if (sale[i] > averageSum) {
                numberOverAverage = numberOverAverage + 1;
            }
        }
        return numberOverAverage;
    }
}