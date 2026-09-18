package src.main.java.lessons.ex1;

import java.util.Scanner;

public class OverflowInteractive {
    public static void main(String[] args) {
        // Scanner — инструмент для чтения ввода с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите любое целое число:");
        int number = scanner.nextInt();
        
        // Приводим к byte — что получится?
        byte asByte = (byte) number;
        
        System.out.println("Вы ввели: " + number);
        System.out.println("В двоичной системе: " + Integer.toBinaryString(number));
        System.out.println("Как byte: " + asByte);
        System.out.println("Как byte в двоичной: " + 
            String.format("%8s", Integer.toBinaryString(asByte & 0xFF))
                .replace(' ', '0'));
        
        scanner.close();
    }
}