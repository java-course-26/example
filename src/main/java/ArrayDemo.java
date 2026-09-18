package src.main.java;

public class ArrayDemo {
    public static void main(String[] args) {
        // Создание массива
        int[] numbers = new int[5]; // Все элементы = 0
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Инициализация сразу
        int[] primes = {2, 3, 5, 7, 11};
        System.out.println("Третий элемент: " + primes[2]);
        // Длина массива
        System.out.println("Длина: " + primes.length);
        
        // Ошибка: выход за границы
        // System.out.println(primes[5]); // ArrayIndexOutOfBoundsException!
        
        // Перебор массива
        System.out.print("Элементы: ");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
        System.out.println();
        
        // For-each (упрощенный цикл)
        System.out.print("For-each: ");
        for (int num : primes) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
