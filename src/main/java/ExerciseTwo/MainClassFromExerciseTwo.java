package ExerciseTwo;

// Составить алгоритм: если введенное имя совпадает с Вячеслав,
// то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class MainClassFromExerciseTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
