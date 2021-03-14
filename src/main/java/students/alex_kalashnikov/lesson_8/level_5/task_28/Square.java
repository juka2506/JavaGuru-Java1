package students.alex_kalashnikov.lesson_8.level_5.task_28;

class Square extends Shape {

    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }

}