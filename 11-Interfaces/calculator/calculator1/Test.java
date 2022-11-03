package OOP.chapter9_interfaces.calculator.calculator1;

import java.util.Scanner;

public class Test {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        CalculatorT1 calculator1 = new CalculatorT1(2);
        calculator1.addFunction(new SinFunction());
        calculator1.addFunction(new CosFunction());

        startCalculator(calculator1);
    }

    private static void startCalculator(CalculatorT1 calculator) {
        calculator.listMathFunction();
        System.out.println("Please enter the name of the function: ");
        String fName = scanner.next();

        if(fName.equalsIgnoreCase("end"))
            System.exit(0);
        System.out.println("Please enter the argument: ");
        double fArg = scanner.nextDouble();
        double result = calculator.doCalculation(fName, fArg);
        System.out.println(fName + " of " + fArg + " is " + result + "\n");

        startCalculator(calculator);    //INFINITE LOOP
    }
}
