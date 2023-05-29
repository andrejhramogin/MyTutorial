package recursion;

public class I {
    public static void main(String[] args) {
recursion(33,2);
    }

    //I: Разложение на множители
    //Дано натуральное число n>1. Выведите все простые множители этого числа в порядке неубывания с учетом кратности.
    // Алгоритм должен иметь сложность O(logn).

    public static void recursion(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }
        else {
            recursion(n, ++k);
        }
    }
}
