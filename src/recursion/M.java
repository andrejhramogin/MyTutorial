package recursion;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        System.out.println(recursion());
        System.out.println(max());
    }

    /*
    M: Максимум последовательности
Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
Определите наибольшее значение числа в этой последовательности.
     */

    //прогон
    public static int max(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            return  0;
        }else{
            return Math.max(n, max());
        }
    }


    //из статьи
    public static int recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, recursion());
        }
    }
}
