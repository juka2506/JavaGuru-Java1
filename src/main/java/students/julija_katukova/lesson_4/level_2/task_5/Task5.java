package students.julija_katukova.lesson_4.level_2.task_5;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first integer number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second integer number: ");
        int num2 = scanner.nextInt();

        if ( num1 > num2 ) {
            System.out.println("The highest number is " + num1);
        }
        else {
            System.out.println("The highest number is " + num2);
        }

    }

}
