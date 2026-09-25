package src.main.java.tasks1.case8;

/**
 * Программа для анализа посещаемости студента за неделю.
 * Считает пропуски, процент посещаемости и ищет двойные прогулы.
 */
public class AttendanceAnalyzer {
    
    public static void main(String[] args) {
        // 1 - присутствовал, 0 - отсутствовал
        int[] attendance = {1, 1, 0, 1, 0, 0, 1};
        
        int absences = 0;
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 0) {
                absences++;
            }
        }
        
        int present = attendance.length - absences;
        double percent = (double) present / attendance.length * 100;
        
        boolean hasDoubleAbsence = false;
        for (int i = 0; i < attendance.length - 1; i++) {
            if (attendance[i] == 0 && attendance[i + 1] == 0) {
                hasDoubleAbsence = true;
                break;
            }
        }
        
        System.out.println("Всего пропусков: " + absences);
        System.out.printf("Посещаемость: %.1f%%\n", percent)
        System.out.println("Были двойные пропуски: " + hasDoubleAbsence);
    }
}
