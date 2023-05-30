package recursion;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
//recursion(0,0);
        average(0, 0);
    }

    /*
    N: Среднее значение последовательности
    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    Определите среднее значение элементов этой последовательности (без учета последнего нуля).
     */

    //прогон
    public static void average(int sum, int counter) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            average(sum + n, ++counter);
        } else if (sum > 0 && counter > 0) {
            System.out.println((float) sum / counter);
        }
    }

    //из статьи
    public static void recursion(int sum, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            recursion(sum + n, ++count);
        } else if (sum > 0 && count > 0) {
            System.out.println((float) sum / count);
        }
    }
}
