package students.julija_katukova.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter integer number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("You entered positive number.");
        }
        else {
            System.out.println("You entered negative number.");
        }

    }
}
