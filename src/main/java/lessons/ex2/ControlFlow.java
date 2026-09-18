package src.main.java.lessons.ex2;
import java.util.Arrays;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("\n--- Char, String и Ловушки сравнения ---");
        demonstrateComparisonTraps();

        System.out.println("\n--- Условные операторы (if-else) ---");
        demonstrateIfElse();

        System.out.println("\n--- Switch (Pattern Matching) ---");
        demonstrateSimpleSwitchCase();
        demonstrateConditionalSwitch();

        System.out.println("\n--- Циклы и Массивы ---");
        demonstrateLoopsAndArrays();
    }

    static void demonstrateComparisonTraps() {
        char letter = 'A';

        System.out.println("Символ: " + letter + ", его код: " + (int) letter);
        System.out.println("Следующий символ: " + (char) (letter + 1)); 

        String s1 = "test";                 // Строковый пул (одна ссылка)
        String s2 = "test";                 // Та же ссылка из пула
        String s3 = new String("test");     // Новый объект в куче (другая ссылка)
        
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("\n[Сравнение строк]");
        System.out.println("s1 == s2: " + (s1 == s2));             // true (ссылки равны)
        System.out.println("s1 == s3: " + (s1 == s3));             // false (ссылки разные!)
        System.out.println("s1.equals(s3): " + s1.equals(s3));     // true (содержимое равно)

        System.out.println("\n[Сравнение массивов]");
        System.out.println("arr1 == arr2: " + (arr1 == arr2));                 // false (разные объекты)
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2));         // false (у массивов equals не переопределен для содержимого!)
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2)); // true (правильный способ)
    }

    static void demonstrateIfElse() {
        int score = 85;
        String grade;

        if (score >= 90) {
            grade = "Отлично (A)";
        } else if (score >= 75) {
            grade = "Хорошо (B)";
        } else if (score >= 60) {
            grade = "Удовлетворительно (C)";
        } else if (score >= 40) {
            grade = "Плохо (D)";
        } else {
            grade = "Неудовлетворительно (F)"; 
        }
        
        System.out.println("Балл: " + score + " -> Оценка: " + grade);
    }

    public static void demonstrateSimpleSwitchCase() {
        int day = 2;
        String dayType;
        String dayString;

        switch (day) {
            case 1 -> dayString = "Понедельник";
            case 2 -> dayString = "Вторник";
            case 3 -> dayString = "Среда";
            case 4 -> dayString = "Четверг";
            case 5 -> dayString = "Пятница";
            case 6 -> dayString = "Суббота";
            case 7 -> dayString = "Воскресенье";

            default -> {
                dayString = "Неизвестный номер дня в неделе";
            }
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> dayType = "будний день";
            case 6, 7          -> dayType = "выходной";

            default            -> dayType = "невозможно определить";
        }

        System.out.println(dayString + " это " + dayType);
    }

    static void demonstrateConditionalSwitch() {
        Object data1 = 42;
        Object data2 = "Java 25";
        Object data3 = null;
        Object data4 = 3.14;

        System.out.println(processObject(data1));
        System.out.println(processObject(data2));
        System.out.println(processObject(data3));
        System.out.println(processObject(data4));
    }

    static String processObject(Object data) {
        return switch (data) {
            case Integer i when i > 0               -> "Положительное целое: " + i;
            case Integer i                          -> "Другое целое: " + i;
            case String s when s.startsWith("Java") -> "Что-то про Java: " + s;
            case String s                           -> "Просто строка: " + s;
            case null                               -> "Это null!";

            default -> "Неизвестный тип: " + data.getClass().getSimpleName();
        };
    }

    static void demonstrateLoopsAndArrays() {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Классический for (когда нужен индекс)
        System.out.print("Классический for: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Усовершенствованный for (for-each)
        System.out.print("For-each: ");
        for (var num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // while (когда не знаем точное кол-во итераций)
        int count = 0;
        while (count < 3) {
            count++;
        }
        System.out.println("While отработал " + count + " раза.");
    }
}