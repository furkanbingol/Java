package OOP.chapter9_interfaces.calculator.calculator3;

public interface Calculator {

    public void addFunction(MathFunction function);

    public void listMathFunction();

    public double doCalculation(String functionName, double arg);

    public double doCalculation(String functionName, double arg1, double arg2); //overloaded method
}
