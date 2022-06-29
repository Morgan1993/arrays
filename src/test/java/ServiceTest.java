import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] sale = {
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        };
        int expected = 60;

        int actual = service.sumAll(sale);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSale() {
        StatsService service = new StatsService();

        int[] sale = {
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        };
        double expected = 5;

        double actual = service.averageSale(sale);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMaxMonth() {
        StatsService service = new StatsService();

        int[] sale = {
                1, 5, 1, 1, 1, 1, 2, 2, 3, 3, 4, 2
        };
        int expected = 2;

        int actual = service.maxMonth(sale);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinMonth() {
        StatsService service = new StatsService();

        int[] sale = {
                1, 5, 1, 0, 1, 1, 2, 2, 3, 3, 4, 2
        };
        int expected = 4;

        int actual = service.minMonth(sale);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthAmountLessAverage() {
        StatsService service = new StatsService();

        int[] sale = {
                1, 5, 1, 0, 1, 1, 2, 2, 3, 3, 4, 2
        };
        int expected = 8;

        int actual = service.monthAmountLessAverage(sale);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthAmountAboveAverage() {
        StatsService service = new StatsService();

        int[] sale = {
                1, 5, 1, 0, 1, 1, 2, 2, 3, 3, 4, 2
        };
        int expected = 4;

        int actual = service.monthAmountAboveAverage(sale);

        assertEquals(expected, actual);
    }
}
