package students.arkadij.lesson_3.level_4;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("BMW");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}