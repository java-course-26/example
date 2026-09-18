package src.main.java.lessons.ex1;

public class ParameterPassingDemo {
    
    // Примитивы передаются по значению (копируется значение)
    public static void changePrimitive(int x) {
        x = 100;
        System.out.println("Внутри changePrimitive: x = " + x);
    }
    
    // Массивы (ссылки) передаются по ссылке
    public static void changeArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Внутри changeArray: arr[0] = " + arr[0]);
    }
    
    public static void reassignArray(int[] arr) {
        arr = new int[5];
        arr[0] = 999;
        System.out.println("Внутри reassignArray: arr[0] = " + arr[0]);
    }
    
    public static void main(String[] args) {
        // Примитив
        int num = 10;
        System.out.println("До вызова: num = " + num);
        changePrimitive(num);
        System.out.println("После вызова: num = " + num);
        
        System.out.println();
        
        // Массив
        int[] numbers = {1, 2, 3};
        System.out.println("До вызова: numbers[0] = " + numbers[0]);
        changeArray(numbers);
        System.out.println("После вызова: numbers[0] = " + numbers[0]);
        
        System.out.println();
        
        // Переназначение ссылки
        int[] arr = {5, 6, 7};
        System.out.println("До вызова: arr[0] = " + arr[0]);
        reassignArray(arr);
        System.out.println("После вызова: arr[0] = " + arr[0]);
    }
}
