// Q: Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

// Class with instance methods for addition and subtraction
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


// Class with a static method for multiplication
class MathUtils {
    public static int multiply(int a, int b) {
        return a * b;
    }
}


public class Question4 {
    public static void main(String[] args) {

            Calculator calculator = new Calculator();


            MathOperation addition = calculator::add;
            System.out.println("Addition: " + addition.operate(10, 5));


            MathOperation subtraction = calculator::subtract;
            System.out.println("Subtraction: " + subtraction.operate(10, 5));


            MathOperation multiplication = MathUtils::multiply;
            System.out.println("Multiplication: " + multiplication.operate(10, 5));
    }
}
