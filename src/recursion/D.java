package recursion;

public class D {

    public static void main(String[] args) {
        System.out.println(povTwo(64));
        System.out.println(povTwo(1));
        System.out.println(povTwo(15));
    }

    //Точная степень двойки
    private static boolean povTwo(long n) {
        if ((n & 1) == 0) return povTwo(n >>> 1);
        return n == 1;
    }
}
