package students.pavels_steinbors._lesson_4.level_1.lesson_4_level_1_task_2.task_1;

import java.util.Scanner;

class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number > 0)

            System.out.println("Number is positive");

        else if (number < 0)

            System.out.println("Number is negative");

    }
}