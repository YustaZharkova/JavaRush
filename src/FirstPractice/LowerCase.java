package FirstPractice;

public class LowerCase {
    public static void main(String[] args) {

        String title = "Senior Lead Principal Software Engineer Data Architect";

        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";

        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        // выводим на экран строку "RESUME" в нижнем регистре, полученное
        // с помощью метода toLowerCase
        System.out.println("RESUME".toLowerCase());
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "TITLE: " и строки из переменной title
        System.out.println(("TITLE: " + title).toLowerCase());
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "DEGREE: " и строки из переменной degree
        System.out.println(("DEGREE: " + degree).toLowerCase());
        // выводим на экран строку в нижнем регистре, которая образована
        // слиянием строки "CAREER: " и строки из переменной career
        System.out.println(("CAREER: " + career).toLowerCase());
    }
}

