package students.lolita_polakova.lesson_5.level_6.task_36;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        int expectedResult = 7;
        int realResult = Arrays.create(7).length;
        if (realResult == expectedResult) {
            System.out.println("Create Array Test: OK");
        } else {
            System.out.println("Create Array Test: FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int[] array = {12, 1, 78, 3, 34, 59, 25};
        int expectedResult = 78;
        int  realResult = Arrays.findMax(array);
        if (realResult == expectedResult) {
            System.out.println("Max Number Test = OK");
        } else {
            System.out.println("Max Number Test = FAIL");
        }
    }
}
