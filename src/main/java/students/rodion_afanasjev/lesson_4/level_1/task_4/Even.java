package students.rodion_afanasjev.lesson_4.level_1.task_4;
import java.util.Scanner;

public class Even {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int number = scan.nextInt();

        if ( number % 2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is not even");
        }
    }
}
