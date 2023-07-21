package ru.netology.stats;

public class StatsService {

    public int sumService(int[] array) { //Сумма всех продаж
        int sumData = 0;
        for (int i = 0; i < array.length; i++) {
            sumData = sumData + array[i];
        }
        return sumData;
    }

    public int averageValueService(int[] array) { // Среднее значение продаж
        int sum = sumService(array);
        int averageValue = sum / array.length;
        return averageValue;
    }

    public int maxSalesService(int[] array) { // Месяц в котором были максимальные продажи
        int maxMonth = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minSalesService(int[] array) { // Месяц в котором были минимальные продажи (из примера)
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int countMinMounthsService(int[] array) { // Количество месяцев в которых продажи были ниже среднего
        int averageValue = averageValueService(array);
        int count = 0; //счетчик месяцев
        for (int i = 0; i < array.length; i++)
            if (array[i] < averageValue) {
                count++;
            }

        return count;
    }

    public int countMaxnMounthsService(int[] array) { // Количество месяцев в которых продажи были выше среднего
        int averageValue = averageValueService(array);
        int count = 0; //счетчик месяцев
        for (int i = 0; i < array.length; i++)
            if (array[i] > averageValue) {
                count++;
            }

        return count;
    }


}



