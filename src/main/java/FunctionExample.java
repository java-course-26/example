package src.main.java;
public class FunctionExample {
    // Public static method (доступен из любого места, не требует экземпляра)
    public static void staticMethod() {
        System.out.println("Это статический публичный метод.");
        FunctionExample example = new FunctionExample();
        example.instanceMethod(); // Вызов метода экземпляра из статического метода
        example.privateMethod();  // Вызов private метода через экземпляр
    }

    // Public instance method (доступен из любого места, требует экземпляра)
    public void instanceMethod() {
        System.out.println("Это публичный метод экземпляра.");
        privateMethod(); // Может вызывать private методы
    }

    // Private method (доступен только внутри класса)
    private void privateMethod() {
        System.out.println("Это приватный метод.");
    }

    public static void main(String[] args) {
        // Вызов статического метода
        staticMethod();

        // Вызов метода экземпляра
        FunctionExample example = new FunctionExample();
        example.instanceMethod();

        // Попытка вызвать private метод извне (не сработает)
        // privateMethod(); // ❌ Ошибка компиляции
    }
}