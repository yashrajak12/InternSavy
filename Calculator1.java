import java.util.Scanner;

interface Calculator {
    double performOperation(double a, double b);
}

class Addition implements Calculator {
    
    public double performOperation(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Calculator {
    
    public double performOperation(double a, double b) {
        return a - b;
    }
}

class Multiplication implements Calculator {
    
    public double performOperation(double a, double b) {
        return a * b;
    }
}

class Division implements Calculator {
    
    public double performOperation(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice;
        do{
            choice = scanner.nextInt();
            Calculator calculator;

            switch (choice) {
                case 1:
                    calculator = new Addition();
                    break;
                case 2:
                    calculator = new Subtraction();
                    break;
                case 3:
                    calculator = new Multiplication();
                    break;
                case 4:
                    calculator = new Division();
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            double result = calculator.performOperation(num1, num2);
            System.out.println("Result: " + result);

            
        }
        while(choice != 4);
    }
}