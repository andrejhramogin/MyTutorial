package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aarray {

    public static void main(String[] args) {

        /**
         *Arrays.sort()
         * Сортировка всего массива
         */
        int[] numbers = {3, 2, 5, 1, 4};
        Arrays.sort(numbers);
       print(numbers);


        /**
         *Arrays.sort()
         * Сортировка массива по индексам
         */
        int[] numbers2 = {1, 67, 15, 11, 44};
        Arrays.sort(numbers2, 0, 4);
        print(numbers2);

        /**
         * Arrays.equals()
         * переопределенный метод для сравнения СОДЕРЖИМОГО (А НЕ ССЫКЛОК) двух массивов между собой
         */
        boolean b = Arrays.equals(numbers, numbers2); //deepEquals для двумерных массивов.
        System.out.println(b);//false

/**
 * Arrays.fill()
 * Заполнить массив одинаковыми значениями. Заполнить можно как весь массив, так и его часть – диапазон индексов.
 * Работает только с одномерными массивами.
 */
//        Arrays.fill(numbers, 555);
//        print(numbers);

        Arrays.fill(numbers2, 0, 3, 444);
        print(numbers2);
        /**
         * Arrays.asList()
         * Перевести Массив в List
          */
        Integer []arrayNumbers = {1,2,3,4};

        List<Integer> listNumbers = Arrays.asList(arrayNumbers);
        List<Integer> intList = Arrays.asList(1,2,3,4);

        /**
         * Arrays.copyOf(), Arrays.copyOfRange()
         * Копирование массива. Если элементы не поместились в новый массив – лишние значения игнорируются.
         * Если длина нового массива больше – ячейки заполняются значениями по умолчанию.
         * Под капотом используется метод System.arraycopy()
         */
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        print(numbersCopy);
        int[] numbersCopy2 = Arrays.copyOf(numbers, 4);          // начать с индекса 4
        print(numbersCopy2);
        int[] numbersCopy3 = Arrays.copyOfRange(numbers, 2, 7);  // индекс 7 НЕ входит
        print(numbersCopy3);


    }






    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
