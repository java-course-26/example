package src.main.java;

public class CallStackDemo {
    
    public static void methodA() {
        int x = 10;
        System.out.println("methodA: x = " + x);
        methodB();
        System.out.println("methodA завершена");
    }
    
    public static void methodB() {
        int y = 20;
        System.out.println("methodB: y = " + y);
        methodC();
        System.out.println("methodB завершена");
    }
    
    public static void methodC() {
        int z = 30;
        System.out.println("methodC: z = " + z);
    }
    
    public static void main(String[] args) {
        System.out.println("main запущен");
        methodA();
        System.out.println("main завершен");

        // Здесь стек выглядит так:
        // [main] -> [methodA] -> [methodB] -> [methodC]
        // Каждый фрейм хранит свои локальные переменные
    }
}
