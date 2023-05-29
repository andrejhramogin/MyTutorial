package recursion;

public class F {
    public static void main(String[] args) {
        System.out.println (reverseNum(12345));
    }

    //Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке,
    //разделяя их пробелами или новыми строками.

     public static int reverseNum (int num){
        if (num<10){
            return num;
        }else{
            System.out.print (num%10 + " ");
            return reverseNum(num/10);
        }
     }
}
