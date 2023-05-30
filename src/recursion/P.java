package recursion;

public class P {
    public static void main(String[] args) {

    }

    /*
    P: Количество элементов, равных максимуму
Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0. Определите,
какое количество элементов этой последовательности, равных ее наибольшему элементу.
     */

    //from article
    public static void recursion(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            }
            else if (n == max) {
                recursion(max, ++count);
            }
            else {
                recursion(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
}
