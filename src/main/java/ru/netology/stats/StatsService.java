package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateMiddleSumMonth(long[] purchases) {
        long middleSumMonth = calculateSum(purchases) / purchases.length;
        return middleSumMonth;
    }

    public int findMonthWithMaxSale(long[] purchases) {
        long currentMax = purchases[0];
        int numberOfMonth = 1;
        int monthWithMaxSale = 0;

        for (long purchase : purchases) {
            if (currentMax <= purchase) {
                currentMax = purchase;
                monthWithMaxSale = numberOfMonth;
            }
            numberOfMonth += 1;
        }
        return monthWithMaxSale;
    }

    public int findMonthWithMinSale(long[] purchases) {
        long currentMin = purchases[0];
        int numberOfMonth = 1;
        int monthWithMinSale = 0;

        for (long purchase : purchases) {
            if (currentMin >= purchase) {
                currentMin = purchase;
                monthWithMinSale = numberOfMonth;
            }
            numberOfMonth += 1;
        }
        return monthWithMinSale;
    }

    public int findQuantityMonthWithSaleLowMiddle(long[] purchases) {
        long middleSumMonth = calculateMiddleSumMonth(purchases);
        int quantityMonth = 0;
        for (long purchase : purchases) {
            if (purchase < middleSumMonth) {
                quantityMonth += 1;
            }
        }
        return quantityMonth;
    }

    public int findQuantityMonthWithSaleHighMiddle(long[] purchases) {
        long middleSumMonth = calculateMiddleSumMonth(purchases);
        int quantityMonth = 0;
        for (long purchase : purchases) {
            if (purchase > middleSumMonth) {
                quantityMonth += 1;
            }
        }
        return quantityMonth;
    }
}
