package recursion;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        System.out.println(recursion());
    }

    /*
    Q: Количество единиц
Дана последовательность натуральных чисел (одно число в строке), завершающаяся двумя числами 0 подряд. Определите,
сколько раз в этой последовательности встречается число 1. Числа, идущие после двух нулей, необходимо игнорировать.
     */

    //??? некорректно работает (из сатьи)
    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 1) {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion() + n + m;
            } else {
                int k = in.nextInt();
                // Базовый случай
                if (k == 1) {
                    // Шаг рекурсии / рекурсивное условие
                    return recursion() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion() + n + m;
            } else {
                return n + m;
            }
        }
    }
}
