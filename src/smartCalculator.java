interface Calculator {
    int add(int a, int b);
    int multiply(int a, int b);
}

interface Scientific {
    int square(int a);
    int cube(int a);
}

public class smartCalculator implements Calculator, Scientific {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }

    public int cube(int a) {
        return a * a * a;
    }

    public static void main(String[] args) {
        smartCalculator calc = new smartCalculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Square: " + calc.square(4));
        System.out.println("Cube: " + calc.cube(3));
    }
}
