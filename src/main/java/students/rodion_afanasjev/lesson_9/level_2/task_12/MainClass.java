package students.rodion_afanasjev.lesson_9.level_2.task_12;

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

public class MainClass {

    public static void main(String[] args) {

        C c = new C(); // В консоль выведутся все 3 строчки

    }

}
