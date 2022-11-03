package OOP.chapter9_interfaces.calculator.calculator1;

public class CalculatorT1 implements Calculator{
    private int functionCount;
    private int currentCount;

    private MathFunction[] functions;
    private double argument;

    //constructor
    public CalculatorT1(int functionCount) {
        this.functionCount = functionCount;
        functions = new MathFunction[functionCount];
    }

    @Override
    public void addFunction(MathFunction function) {
        functions[currentCount] = function;
        currentCount++;
    }

    @Override
    public void listMathFunction() {
        System.out.println("Avaliable Functions: ");
        for (MathFunction f : functions)
            System.out.println(f.getName());
    }

    @Override
    public double doCalculation(String functionName, double arg) {
        double result = 0.0;
        boolean isFunctionFound = false;
        for (MathFunction f : functions) {
            if (functionName.equalsIgnoreCase(f.getName())) {
                result = f.calculate(arg);
                isFunctionFound = true;
            }
        }
        if(!isFunctionFound)
            System.out.println("No such function found!");
        return result;
    }
}
