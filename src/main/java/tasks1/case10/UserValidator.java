package src.main.java.tasks1.case10;

/**
 * Программа для валидации списка пользователей.
 * Проверяет занятость имени, считает занятые невалидные имена (короче 5)
 * и ищет имя на букву 'А'.
 */
public class UserValidator {
    
    public static void main(String[] args) {
        String[] users = {"Alex", "Maria", "Ivan", "Anna", "Dmitry"};
        String newUser = new String("Alex");

        boolean isTaken = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == newUser) {
                isTaken = true;
            }
        }
        
        if (isTaken) {
            System.out.println("Имя '" + newUser + "' уже занято!");
        }

        int invalidCount = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].length() < 5) {
                invalidCount = invalidCount + 1;
            }
        }
        System.out.println("Невалидных имен: " + invalidCount);

        String firstA = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i].substring(0, 1) == "A" || users[i].substring(0, 1) == "А") {
                firstA = users[i];
            }
        }
        System.out.println("Первое имя на 'А': " + firstA);
    }
}