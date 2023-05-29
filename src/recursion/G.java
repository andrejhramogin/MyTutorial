package recursion;

public class G {
    public static void main(String[] args) {
        System.out.println(outputNum(12345));
    }

    //Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке,
    // разделяя их пробелами или новыми строками.

    public static String outputNum(int num){
        if(num<10){
            return String.valueOf(num);
        }else{
            return outputNum(num/10) + " " + num%10;
        }
    }
}
