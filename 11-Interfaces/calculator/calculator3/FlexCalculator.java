package OOP.chapter9_interfaces.calculator.calculator3;

public class FlexCalculator implements Calculator{
    private int functionCount;
    private int currentCount = 0;

    private MathFunction[] functions;
    private double argument;

    public FlexCalculator(int functionCount) {
        this.functionCount = functionCount;
        functions = new MathFunction[functionCount];
    }

    public void addFunction(MathFunction function) {
        functions[currentCount] = function;
        currentCount++;
    }

    //1 ARGUMANLI CALCULATION
    public double doCalculation(String functionName, double arg) {
        double result = 0.0;
        boolean isFunctionFound = false;
        for (MathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {
                result = ((SingleArgMathFunction)function).calculate(arg);
                isFunctionFound = true;
            }
        }
        if(!isFunctionFound)
            System.out.println("No such function found!");

        return result;
    }

    //2 ARGUMANLI CALCULATION
    public double doCalculation(String functionName, double arg1, double arg2) {
        double result = 0.0;
        boolean isFunctionFound = false;
        for (MathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {
                result = ((DoubleArgMathFunction)function).calculate(arg1, arg2);
                isFunctionFound = true;
            }
        }
        if(!isFunctionFound)
            System.out.println("No such function found!");

        return result;
    }

    public void listMathFunction() {
        System.out.println("Available Functions:");
        for (MathFunction function : functions)
            System.out.println(function.getName());
    }
}

