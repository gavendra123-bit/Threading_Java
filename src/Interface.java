interface A {
    void method1();
    void method2();
}

@FunctionalInterface
interface B {
    void display();
}

class FunctionA implements A {
    public void method1() {
        System.out.println("Function A - Method 1 executed");
    }
    public void method2() {
        System.out.println("Function A - Method 2 executed");
    }
}

public class Interface {
    public static void main(String[] args) {

        FunctionA objA = new FunctionA();
        objA.method1();
        objA.method2();

        B objB = () -> System.out.println("Function B (Functional Interface) executed using Lambda");
        objB.display();
    }
}

