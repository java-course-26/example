package src.main.java.tasks1.case4;

/**
 * Программа для анализа списка товаров в магазине.
 * Находит самое длинное название, считает товары с заданным префиксом
 * и ищет конкретный товар target.
 */
public class ProductAnalyzer {

    public static void main(String[] args) {
        String[] products = {"SuperPhone", "MegaLaptop", "SuperWatch", "Tablet", "SuperCamera", "Headphones"};
        String prefix = "Super";
        String target = "MegaLaptop";

        // 1. Ищем самое длинное название
        String longest = "";
        for (int i = 0; i < products.length; i++) {
            if (products[i].length() > longest.length()) {
                longest = products[i];
            }
        }

        // 2. Считаем товары, которые начинаются на "Super"
        int prefixCount = 0;
        for (int i = 0; i < products.length; i++) {
            // Используем .startsWith() вместо перечисления вручную
            if (products[i].startsWith(prefix)) {
                prefixCount++;
            }
        }

        // 3. Ищем конкретный товар
        boolean isFound = false;
        for (int i = 0; i < products.length; i++) {
            // Используем .equals() вместо == для сравнения строк
            if (products[i].equals(target)) {
                isFound = true;
            }
        }

        System.out.println("Самый длинный товар: " + longest);
        System.out.println("Товаров на 'Super': " + prefixCount);
        System.out.println("Товар '" + target + "' найден? " + isFound);
    }
}