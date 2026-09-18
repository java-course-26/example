package src.main.java.lessons.ex1;

public class MemoryDemo {
    public static void main(String[] args) {
        // Примитив - значение в стеке
        int primitive = 42;
        System.out.println("primitive: " + primitive);
        
        // Обертка - объект в куче, ссылка в стеке
        Integer wrapper = Integer.valueOf(200);
        System.out.println("wrapper: " + wrapper);
        
        // Массивы
        int[] arr = new int[]{1, 2, 3};
        // Две ссылки на один массив
        int[] arr1 = new int[]{10, 20, 30};
        int[] arr2 = arr1; // Копируется ссылка, а не значения
        arr2[0] = 999;
        System.out.println("arr1[0]: " + arr1[0]);
    }
}
