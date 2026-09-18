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

        String longest = "";
        for (int i = 0; i < products.length; i++) {
            if (products[i].length() > longest.length()) {
                longest = products[i];
            }
        }

        int prefixCount = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == "SuperPhone" || products[i] == "SuperWatch" || products[i] == "SuperCamera") {
                prefixCount++;
            }
        }

        boolean isFound = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == target) { 
                isFound = true;
            }
        }

        System.out.println("Самый длинный товар: " + longest);
        System.out.println("Товаров на 'Super': " + prefixCount);
        System.out.println("Товар '" + target + "' найден? " + isFound);
    }
}
