package src.main.java.tasks1.case9;

/**
 * Программа для анализа списка файлов в папке.
 * Ищет конкретный файл, считает текстовые документы и находит файл с самым коротким именем.
 */
public class FileAnalyzer {
    
    public static void main(String[] args) {
        // Список файлов в директории
        String[] files = {"report.txt", "image.png", "data.txt", "notes.txt", "archive.zip"};
        String targetFile = new String("report.txt");

        boolean isFound = false;
        for (int i = 0; i < files.length; i++) {
            if (files[i] == targetFile) { //оператор == сравнивает ссылки на объекты,а не их содержимое.сравнение files[i] == targetFile всегда будет возвращать false
                isFound = true;//нужно использовать .equals()
            }
        }
        
        if (isFound) {
            System.out.println("Файл '" + targetFile + "' найден!");
        } else {
            System.out.println("Файл не найден.");
        }

        int txtCount = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].substring(files[i].length() - 4) == ".txt") {// та же ошибка, что и в 16 строчке ,исправление с помощью .endsWith(),т.к если длина будет слишком короткое,будет ошибка
                txtCount = txtCount + 1;
            }
        }
        System.out.println("Текстовых файлов: " + txtCount);

        String shortestFile = "";
        for (int i = 0; i < files.length; i++) {
            if (files[i].length() < shortestFile.length()) {// т.к переменная введена как пустая строка(длина 0), то условие никогда не выполниться и программа выдаст пустой результат
                shortestFile = files[i];
            }
        }
        System.out.println("Самый короткий файл: " + shortestFile);
    }
}
