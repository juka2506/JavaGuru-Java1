package students.arkadij.lesson_4.task_24;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.theAllTests();
    }

    public void theAllTests(){
        sumTest();
        subTest();
        mulTest();
        divTest();
        isEvenTest1();
        isEvenTest2();
    }


    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 75) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 20) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 25) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        if (result == false) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

}