package students.deniss_jankovskis.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {


    public void fillTwoDimArr(int[][] arr) {

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(20);
            }

        }

    }

    public int sumTwoDimArr(int[][] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

        }

        return sum;
    }


}

