import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Was it a cat I saw?")); // Выведет true
        System.out.println(isPalindrome("10801.")); // Выведет false
    }
    public static boolean isPalindrome(String text) {
        // Удаление всех символов, не являющихся буквами и цифрами
        String preparedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Проверка на палиндром
        for (int i = 0; i < preparedText.length() / 2; i++) {
            if (preparedText.charAt(i) != preparedText.charAt(preparedText.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
































