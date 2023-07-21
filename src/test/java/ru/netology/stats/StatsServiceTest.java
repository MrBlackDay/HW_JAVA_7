package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test //Сумма всех продаж
    public void testSumData() {
        StatsService sumData = new StatsService();
        int expected = 180;
        int[] arrDataBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = sumData.sumService(arrDataBase);
        Assertions.assertEquals(expected, actual);
    }

    @Test // Среднее значение продаж
    public void testAverageValue() {
        StatsService averageValue = new StatsService();
        int expected = 15;
        int[] arrDataBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = averageValue.averageValueService(arrDataBase);
        Assertions.assertEquals(expected, actual);
    }

    @Test // Месяц в котором были максимальные продажи
    public void testMaxSales() {
        StatsService maxSales = new StatsService();
        int expected = 8;
        int[] arrDataBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = maxSales.maxSalesService(arrDataBase);
        Assertions.assertEquals(expected, actual);
    }

    @Test // Месяц в котором были минимальные продажи
    public void testMinSales() {
        StatsService minSales = new StatsService();
        int expected = 9;
        int[] arrDataBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = minSales.minSalesService(arrDataBase);
        Assertions.assertEquals(expected, actual);
    }

    @Test // Количество месяцев в которых продажи были ниже среднего
    public void testCountMinMounths() {
        StatsService countMinMounths = new StatsService();
        int expected = 5;
        int[] arrDataBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = countMinMounths.countMinMounthsService(arrDataBase);
        Assertions.assertEquals(expected, actual);
    }

    @Test // Количество месяцев в которых продажи были ниже среднего
    public void testCountMaxnMounths() {
        StatsService countMaxnMounths = new StatsService();
        int expected = 5;
        int[] arrDataBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = countMaxnMounths.countMaxnMounthsService(arrDataBase);
        Assertions.assertEquals(expected, actual);
    }

}




