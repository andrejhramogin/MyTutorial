package recursion;

public class A {

    public static void main(String[] args) {

        printNum(1, 15);

        System.out.println("\n" + recursion(10));

    }

    //Дано натуральное число n. Выведите все числа от 1 до n.
    public static void printNum(int x, int y) {
        System.out.print(x + " ");
        if ((x + 1) <= y) {
            printNum(++x, y);
        }
    }



    //Решение из статьи
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }
}
