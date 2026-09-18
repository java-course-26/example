package src.main.java.lessons.ex2;

import java.util.Arrays;

public class MethodsAndAlgorithms {
    public static void main(String[] args) {
        System.out.println("\n--- Void vs Возвращаемое значение (return) ---");
        demonstrateVoidVsReturn();

        System.out.println("\n--- Передача аргументов в методы ---");
        demonstrateArgumentPassing();

        System.out.println("\n--- Алгоритмы ---");
        
        String text = "Hello, World! Привет, Java 25!";
        countVowelsAndConsonants(text);

        int[] data = {1, 2, 2, 3, 4, 1, 5, 6, 7, 8, 2};
        int maxLen = findLongestIncreasingSequence(data);
        System.out.println("Задача 2 (Массивы): Макс. длина = " + maxLen);

        String[] list1 = {"apple", "banana", "orange"};
        String[] list2 = {"grape", "banana", "apple", "melon"};
        findIntersection(list1, list2);
    }


    static void demonstrateVoidVsReturn() {
        System.out.println("Метод void (просто выполняет действие):");
        // void метод ничего не возвращает, его нельзя присвоить переменной.
        // Он просто "делает что-то" (печатает, рисует, сохраняет).
        printGreeting("Маша"); 
        
        System.out.println("Метод с return (вычисляет и отдает результат):");
        // Метод с return что-то вычисляет и "отдает" это значение обратно.
        // Результат можно куда-то сохранить (в переменную) или сразу использовать.
        int sum = calculateSum(5, 10); 
        System.out.println("Сумма, которую вернул метод: " + sum);
    }

    static void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static int calculateSum(int a, int b) {
        int result = a + b;
        return result; // Возвращаем значение вызывающему коду
    }


    static void demonstrateArgumentPassing() {
        int primitive = 10;
        int[] array = {1, 2, 3};

        System.out.println("До метода: primitive = " + primitive + ", array = " + Arrays.toString(array));
        
        modifyArguments(primitive, array);

        System.out.println("После метода: primitive = " + primitive + ", array = " + Arrays.toString(array));
    }

    static void modifyArguments(int num, int[] arr) {
        num = 999;        
        arr[0] = 99;      
        arr = new int[]{7, 7, 7}; 
    }


    static void countVowelsAndConsonants(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("Задача 1 (Строки): Пустая строка");
            return;
        }

        int vowels = 0;
        int consonants = 0;

        for (var ch : text.toCharArray()) {
            if (!Character.isLetter(ch)) continue; 

            switch (Character.toLowerCase(ch)) {
                case 'а', 'е', 'ё', 'и', 'о', 'у', 
                     'ы', 'э', 'ю', 'я', 'a', 'e', 
                     'i', 'o', 'u', 'y' -> vowels++;
                default -> consonants++; 
            }
        }
        System.out.printf("Задача 1 (Строки): Гласных = %d, Согласных = %d%n", vowels, consonants);
    }



    static boolean isVowel(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
                'a', 'e', 'i', 'o', 'u', 'y' -> true;
            default -> false;
        };
    }

    static boolean isVowel2(char c) {
        // Если символ найден в строке гласных, indexOf вернет позицию (>= 0)
        // Если не найден — вернет -1
        return "аеёиоуыэюяaeiouy".indexOf(Character.toLowerCase(c)) >= 0;
    }


    static int findLongestIncreasingSequence(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        if (arr.length == 1) return 1;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] > arr[i]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength); 
            } else {
                currentLength = 1; 
            }
        }
        return maxLength;
    }


    static void findIntersection(String[] arr1, String[] arr2) {
        System.out.print("Задача 3 (Пересечение): Общие элементы = [");
        
        boolean isFirst = true;
        for (var s1 : arr1) {
            for (var s2 : arr2) {
                if (s1.equals(s2)) {
                    if (!isFirst) System.out.print(", ");
                    System.out.print(s1);
                    isFirst = false;
                    break; 
                }
            }
        }
        System.out.println("]");
    }


    
    static boolean contains(String[] array, String target) {
        for (var item : array) {
            if (item.equals(target)) {
                return true; // Нашли, сразу выходим из метода
            }
        }
        return false; // Пробежали весь массив и не нашли
    }
}
