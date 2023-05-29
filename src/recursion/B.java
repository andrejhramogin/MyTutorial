package recursion;

public class B {
    public static void main(String[] args) {
        printAB(-10, 10);
        System.out.println();
        printAB(5, -5);

        System.out.println("\n" + recursion(10, 20));
        System.out.println(recursion(40, 20));

    }

    //Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
    // в порядке возрастания, если A < B, или в порядке убывания в противном случае.

    public static void printAB(int a, int b) {
        System.out.print(a + " ");
        if (a < b) printAB(++a, b);
        if (a > b) printAB(--a, b);
    }

    //решение из статьи
    public static String recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(--a, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(++a, b);
        }
    }
}
