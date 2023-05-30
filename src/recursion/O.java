package recursion;

import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        recursion(0,0);
    }
    /*
    O: Второй максимум
Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
Определите значение второго по величине элемента в этой последовательности, то есть элемента,
который будет наибольшим, если из последовательности удалить наибольший элемент.
     */


    //из статьи
    public static void recursion(int max1, int max2) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (max1 < n) {
                recursion(n, max1);
            }
            else if (max2 < n) {
                recursion(max1, n);
            }
            else {
                recursion(max1, max2);
            }
        } else {
            System.out.println(max2);
        }
    }
}
