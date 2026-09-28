package src.main.java.tasks1.case1;

/**
 * Программа для анализа оценок студентов.
 * Вычисляет среднюю оценку, количество пятёрок и двоек.
 */
public class GradesAnalyzer {
    
    public static void main(String[] args) {
        // Массив оценок студентов
        int[] grades = {5, 4, 3, 5, 2, 4, 5, 3, 4, 5, 2, 3};
        
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        
        double average = (double) sum / grades.length;
        
        int count5 = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 5) {
                count5 = count5 + 1;
            }
        }
        
        int count2 = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                count2 = count2 + 1;
            }
        }
        
        System.out.println("Средняя оценка: " + average);
        System.out.println("Отличников (5): " + count5);
        System.out.println("Двоечников (2): " + count2);
        
        if (grades.length > 0) {
            int max = grades[0];
            for (int i = 1; i < grades.length; i++) {
                if (grades[i] > max) {
                    max = grades[i];
                }
            }
            System.out.println("Максимальная оценка: " + max);
        }
    }
}
