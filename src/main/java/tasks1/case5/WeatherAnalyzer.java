package src.main.java.tasks1.case5;

/**
 * Программа для анализа погоды за неделю.
 * Находит экстремальные температуры, среднюю и количество морозных дней.
 */
public class WeatherAnalyzer {
    
    public static void main(String[] args) {
        int[] temperatures = {-5, 2, -1, 4, -8, 0, 3};

        int min = temperatures[0];
        int max = temperatures[0];
        int sum = 0;
        int frostDays = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < min) {
                min = temperatures[i];
            }
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
            sum += temperatures[i];
            if (temperatures[i] < 0) {
                frostDays++;
            }
        }

        int average = sum / temperatures.length; 

        System.out.println("Минимальная температура: " + min);
        System.out.println("Максимальная температура: " + max);
        System.out.println("Средняя температура: " + average);
        System.out.println("Морозных дней: " + frostDays);
    }
}
