package ru.netology.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_allSame() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 5, 5, 5, 5};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_allDifferent() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 11, 3, 9, 6, 7, 2, 1};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_negativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-5, -10, -1, -8, -3};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_mixedNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, -10, 8, -4, 11, -3, 9, -6, 7, -2, 1};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
