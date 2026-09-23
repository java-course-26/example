/**
 * Программа для анализа погоды за неделю.
 * Находит экстремальные температуры, среднюю и количество морозных дней.
 */
public class WeatherAnalyzer {
    public static int Min(int[] temps){
        var min = 1000;
        for (int t:temps){
            if (t < min){
                min = t;
            }
        }
        return min;
    }
    public static int Max(int[] temps){
        var max = -1000;
        for (int t:temps){
            if (t > max){
                max = t;
            }
        }
        return max;
    }
    public static int CntFrost(int[] temps){
        int cnt = 0;
        for (int t:temps){
            if (t < 0){
                cnt++;
            }
        }
        return cnt;
    }

    public static double Sum(int[] temps){
        double summa = 0;
        for (int t:temps){
            summa += t;
        }
        return summa;                           //вынес логику инициализации переменных в отдельные методы
    }

    public static void main(String[] args) {
        int[] temperatures = {-5, 2, -1, 4, -8, 0, 3};

        int min = Min(temperatures);
        int max = Max(temperatures);
        double sum = Sum(temperatures);
        int frostDays = CntFrost(temperatures); //не считались отрицательные значения

        double average = sum / temperatures.length;      //изменил тип данных для точности

        System.out.println("Минимальная температура: " + min);
        System.out.println("Максимальная температура: " + max);
        System.out.println("Средняя температура: " + average);
        System.out.println("Морозных дней: " + frostDays);
    }
}