package src.main.java;
/**
 * Калькулятор для выполнения базовых арифметических операций
 * Поддерживает сложение, вычитание, умножение и деление
 */
public class Calculator {
    /**
     * Вычисляет сумму двух чисел
     * 
     * @param a Первое число
     * @param b Второе число
     * @return Результат сложения
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Вычисляет разность двух чисел
     * 
     * @param a Первое число
     * @param b Второе число
     * @return Результат вычитания
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Вычисляет произведение двух чисел
     * 
     * @param a Первое число
     * @param b Второе число
     * @return Результат умножения
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Вычисляет частное двух чисел
     * 
     * @param a Первое число
     * @param b Второе число
     * @return Результат деления
     * @throws ArithmeticException Если попытка деления на ноль
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a / b;
    }

    /**
     * Главный метод программы
     * 
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        double result1 = add(10, 5);
        double result2 = subtract(10, 5);
        double result3 = multiply(10, 5);
        double result4 = divide(10, 5);

        System.out.println("Сумма: " + result1);
        System.out.println("Разность: " + result2);
        System.out.println("Произведение: " + result3);
        System.out.println("Частное: " + result4);
    }
}
