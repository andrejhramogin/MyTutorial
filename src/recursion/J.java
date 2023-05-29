package recursion;

public class J {
    public static void main(String[] args) {

        isPalindrome("abac");

        System.out.println(recursion("abcdcba"));
    }

//Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом.
// Выведите YES или NO.

    public static void isPalindrome(String str) {
        if (str.length() == 1) {
            System.out.println("Yes");
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            str = str.substring(1, str.length() - 1);
            if (str.length() > 2)
                isPalindrome(str);
            else System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //из статьи
    public static String recursion(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                // Шаг рекурсии / рекурсивное условие
                return recursion(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
}
