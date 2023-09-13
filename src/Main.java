import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello Van");
        System.out.println("Enter your Equation");
        Scanner equation = new Scanner(System.in);
        String eval = equation.nextLine();
        CalculatorService calculatorService = new CalculatorService();
        double result;
        try {
            result = calculatorService.calculate(eval);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}