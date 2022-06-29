package org.example;

import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService statsService = new StatsService();
        int[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println(statsService.sumAll(sale));
        System.out.println(statsService.averageSale(sale));
        System.out.println(statsService.maxMonth(sale));
        System.out.println(statsService.minMonth(sale));
        System.out.println(statsService.monthAmountLessAverage(sale));
        System.out.println(statsService.monthAmountAboveAverage(sale));
    }
}