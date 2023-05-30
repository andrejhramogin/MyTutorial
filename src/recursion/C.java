package recursion;

public class C {
    public static void main(String[] args) {
        System.out.println(recursion(3,3));
    }
/*
C: Функция Аккермана
В теории вычислимости важную роль играет функция Аккермана A(m,n)
Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n).
 */

    //из статьи
    public static int recursion(int m, int n) {
        // Базовый случай
        if (m == 0) {
            return n + 1;
        } // Шаг рекурсии / рекурсивное условие
        else if (n == 0 && m > 0) {
            return recursion(m - 1, 1);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion(m - 1, recursion(m, n - 1));
        }
    }
}
