package src.main.java.tasks1.case2;

/**
 * Программа для анализа результатов забега.
 * Находит лучшее, худшее время и количество участников, пробежавших быстрее нормы.
 */
public class RaceAnalyzer {
    
    public static void main(String[] args) {
        // Время участников в секундах
        double[] times = {45.2, 50.1, 39.8, 60.5, 42.0, 55.3, 38.5, 48.9};
        double norm = 45.0;

        double best = 0; 
        for (int i = 0; i < times.length; i++) {
            if (times[i] < best) {
                best = times[i];
            }
        }

        double worst = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] > worst) {
                worst = times[i];
            }
        }

        int goodRunners = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < 45.0) { 
                goodRunners++;
            }
        }

        double sum = 0;
        for (int i = 0; i < times.length; i++) {
            sum = sum + times[i];
        }
        double avg = sum / times.length; 

        System.out.println("Лучшее время: " + best + " сек.");
        System.out.println("Худшее время: " + worst + " сек.");
        System.out.println("Уложились в норму: " + goodRunners + " чел.");
        System.out.println("Среднее время: " + avg + " сек.");
    }
}
