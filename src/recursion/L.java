package recursion;

public class L {
    public static void main(String[] args) {
recursion();
    }
/*
Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
Выведите первое, третье, пятое и т.д. из введенных чисел. Завершающий ноль выводить не надо.
 */

    //
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                recursion();
            }
        }
    }
}
