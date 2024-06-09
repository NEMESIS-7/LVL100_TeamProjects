//Method Overloading(runtime polymorphism)

class Calculator {
    public int add(){           //method overloading
        return 0;
    }
    // Method to add two integers
    public int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
    // Method to add three integers
    public int add(int a, int b, int c) {
        int sum;
        sum = a + b + c;
        return sum;
    }

    // Method to add two double values
    public double add(double a, double b) {
        double sum;
        sum = a + b;
        return sum;
    }
    // Method to add three double values
    public double add (double a, double b, double c) {
        double sum;
        sum = a + b + c;
        return sum;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));          // invokes add(int, int)
        System.out.println("Sum of 2, 3, and 4: " + calc.add(2, 3, 4));    // invokes add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));    // invokes add(double, double)
        System.out.println("Sum of 2.5, 3.5, and 4.5: " + calc.add(2.5, 3.5, 4.5)); // invokes add(double, double, double)
    }
}
