import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        int[] arrDataBase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService sumData = new StatsService(); //Сумма всех продаж
        int answerSum = sumData.sumService(arrDataBase);
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("1. Сумма всех продаж - " + answerSum);
        System.out.println("+------------------------------------------------------------------------+");

        StatsService averageValue = new StatsService(); // Среднее значение продаж
        int answerAverageValue = averageValue.averageValueService(arrDataBase);
        System.out.println("2. Среднее значение всех продаж - " + answerAverageValue);
        System.out.println("+------------------------------------------------------------------------+");

        StatsService maxSales = new StatsService(); // Месяц в котором были максимальные продажи
        int answerMaxSales = maxSales.maxSalesService(arrDataBase);
        System.out.println("3. Номер месяца, в котором был максимум продаж - " + answerMaxSales);
        System.out.println("+------------------------------------------------------------------------+");

        StatsService minSales = new StatsService(); // Месяц в котором были минимальные продажи
        int answerMinSales = minSales.minSalesService(arrDataBase);
        System.out.println("4. Номер месяца, в котором был минимум продаж - " + answerMinSales);
        System.out.println("+------------------------------------------------------------------------+");


        StatsService countMinMounths = new StatsService(); // Количество месяцев в которых продажи были ниже среднего
        int answercountMinMounths = countMinMounths.countMinMounthsService(arrDataBase);
        System.out.println("5. Количество месяцев в которых продажи были ниже среднего - " + answercountMinMounths);
        System.out.println("+------------------------------------------------------------------------+");

        StatsService countMaxnMounths = new StatsService(); // Количество месяцев в которых продажи были ниже среднего
        int answercountMaxnMounths = countMaxnMounths.countMaxnMounthsService(arrDataBase);
        System.out.println("6. Количество месяцев в которых продажи были ниже среднего - " + answercountMaxnMounths);
        System.out.println("+------------------------------------------------------------------------+");


    }
}