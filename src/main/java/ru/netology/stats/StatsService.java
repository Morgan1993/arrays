package ru.netology.stats;

public class StatsService {
    public int sumAll(int[] sale) {
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum += sale[i];
        }
        return sum;
    }

    public double averageSale(int[] sale) {
        int sum = sumAll(sale);
        return (double) sum / sale.length;
    }

    public int maxMonth(int[] sale) {
        int max = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > sale[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minMonth(int[] sale) {
        int min = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < sale[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int monthAmountLessAverage(int[] sale) {
        double average = averageSale(sale);
        int amount = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < average) {
                amount++;
            }
        }
        return amount;
    }

    public int monthAmountAboveAverage(int[] sale) {
        double average = averageSale(sale);
        int amount = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > average) {
                amount++;
            }
        }
        return amount;
    }
}
