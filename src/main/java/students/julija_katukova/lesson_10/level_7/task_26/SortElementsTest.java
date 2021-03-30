package students.julija_katukova.lesson_10.level_7.task_26;

import java.util.Arrays;

class SortElementsTest {
    public static void main(String[] args) {
        SortElementsTest sortElementsTest = new SortElementsTest();
        sortElementsTest.test1();
        sortElementsTest.test2();
        sortElementsTest.test3();
    }

    private void test1() {
        Object object1 = new Object("Watermelon");
        Object object2 = new Object("Apple");
        Array array = new Array();
        array.addNewElement(object1);
        array.addNewElement(object2);
        array.sortElements();
        Object[] realResult = array.getObjects();
        check(realResult, new Object[]{object2, object1}, "Test1");
    }

    private void test2() {
        Object object1 = new Object("Apple");
        Object object2 = new Object("Watermelon");
        Object object3 = new Object("Orange");
        Object object4 = new Object("Pear");
        Object object5 = new Object("Cherry");
        Array array = new Array();
        array.addNewElement(object1);
        array.addNewElement(object2);
        array.addNewElement(object3);
        array.addNewElement(object4);
        array.addNewElement(object5);
        array.sortElements();
        Object[] realResult = array.getObjects();
        check(realResult, new Object[]{object1, object5, object3, object4, object2}, "Test2");
    }

    private void test3() {
        Object object1 = new Object("Plum");
        Object object2 = new Object("Peach");
        Object object3 = new Object("Pineapple");
        Object object4 = new Object("Pear");
        Object object5 = new Object("Papaya");
        Array array = new Array();
        array.addNewElement(object1);
        array.addNewElement(object2);
        array.addNewElement(object3);
        array.addNewElement(object4);
        array.addNewElement(object5);
        array.sortElements();
        Object[] realResult = array.getObjects();
        check(realResult, new Object[]{object5, object2, object4, object3, object1}, "Test3");
    }

    private void check(Object[] realResult, Object[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
