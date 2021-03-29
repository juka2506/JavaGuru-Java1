package students.vitaly_porsev.lesson_8.level_5.task_24;

import java.util.Random;

class ShapeUtil {

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle(random.nextInt(500));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square(random.nextInt(300));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle(random.nextInt(100), random.nextInt(100), random.nextInt(200));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle(random.nextInt(100), random.nextInt(200));
    }
}