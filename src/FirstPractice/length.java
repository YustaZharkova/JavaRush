package FirstPractice;

public class length {

    public static void main(String[] args) {

        String emptyString = "";// объявляем переменную emptyString типа String и присваиваем ей значение - пустую строку ""

        System.out.println(emptyString.length());// выводим на экран значение длины строки из переменной emptyString, полученное с помощью метода length

        System.out.println("Gomu Gomu no Bazooka!".length());// выводим на экран значение длины строки "Gomu Gomu no Bazooka!", с помощью метода length

        System.out.println((emptyString + 2 + 2 + "22").length()); // выводим на экран значение длины строки, полученной в результате слияния строк и чисел emptyString + 2 + 2 + "22" при этом числа будут преобразованы в строки перед соединением
    }
}

