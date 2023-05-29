package recursion;

public class E {
    public static void main(String[] args) {
        System.out.println(sumDig(1234, 0)); //10
        System.out.println(sumDig1(123)); //6
    }

    //Дано натуральное число N. Вычислите сумму его цифр.
    //При решении этой задачи нельзя использовать строки, списки, массивы, циклы.

    public static int sumDig(int num, int sum) {
        sum += num % 10;
        if (num > 0) {
            return sumDig(num/10, sum);
        }
        return sum;
    }


    //из статьи
    public static int sumDig1(int num ) {
        if (num < 10) {
            return num;
        }else {
            return sumDig1(num/10) + num%10;
        }
    }
}
