package SecondDay;

import java.util.Scanner; // Импорт класса Scanner из пакета java.util

public class MyScanner { // Изменено имя класса, чтобы избежать конфликта
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // Создание объекта Scanner для ввода
        String name = console.nextLine(); // Чтение строки
        int age = console.nextInt(); // Чтение целого числа

        System.out.println("Name: " + name); // Вывод имени
        System.out.println("Age: " + age); // Вывод возраста
    }
}