package src.main.java.tasks1.case6;

/**
 * Программа для проверки надежности пароля.
 * Проверяет длину, наличие цифр и заглавных букв.
 */
public class PasswordValidator {
    
    public static void main(String[] args) {
        String password = "MyPass123";
        boolean isValid = true;

        if (password.length() < 8) {
            isValid = false;
        }

        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            // ASCII коды
            if (c >= 48 && c <= 57) { 
                hasDigit = true;
            }
        }
        if (!hasDigit) {
            isValid = false;
        }

        boolean hasUpper = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            // ASCII коды
            if (c >= 65 && c <= 90) {
                hasUpper = true;
            }
        }
        if (!hasUpper) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Пароль надежный!");
        } else {
            System.out.println("Пароль слишком слабый.");
        }
    }
}
