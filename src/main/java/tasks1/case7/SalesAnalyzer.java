package src.main.java.tasks1.case7;

/**
 * Программа для анализа ежедневных продаж магазина.
 * Вычисляет общую выручку, количество успешных дней и минимальную продажу.
 */
public class SalesAnalyzer {
    
    public static void main(String[] args) {
        // Выручка за 5 дней
        double[] sales = {12500.50, 8000.00, 15000.00, 9500.75, 11000.00};
        
        double totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum = totalSum + sales[i];
        }
        
        int goodDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > 10000) {
                goodDays = goodDays + 1;
            }
        }
        
        double minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSale) {
                minSale = sales[i];
            }
        }
        
        System.out.println("Общая выручка: " + totalSum);
        System.out.println("Успешных дней: " + goodDays);
        System.out.println("Минимальная выручка: " + minSale);
    }
}