package src.main.java.tasks1.case3;

/**
 * Программа для поиска и анализа книг в библиотеке.
 * Ищет нужную книгу, считает количество её экземпляров 
 * и находит самую длинную по названию книгу.
 */
public class LibrarySearch {
    public static boolean poiskKnigi(String[] books, String targetBook){
        for(String arg:books){
            if (arg == targetBook){
                return true;
            }
        }
        return false;//вынес функцию поиска необходимой книги
    }
    public static void main(String[] args) {
        // Список книг в библиотеке
        String[] books = {"Война и мир", "1984", "Мастер и Маргарита", "1984", "Преступление и наказание"};//убрали new String тк он сохраняет ссылку на объект
        String targetBook = "1984";// файл сохранял ссылку на объект, а не сам объект, поэтому код не работал

        boolean isFound = poiskKnigi(books,targetBook);

        if (isFound) {
            System.out.println("Книга '" + targetBook + "' найдена в библиотеке!");
        } else {
            System.out.println("Книга не найдена.");
        }

        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == targetBook) {
                count ++;//count ++ вместо count+1
            }
        }
        System.out.println("Количество экземпляров: " + count);

        String longestBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].length() > longestBook.length()) {
                longestBook = books[i];
            }
        }
        System.out.println("Самая длинная книга: " + longestBook + " (символов: " + longestBook.length() + ")");
    }
}
