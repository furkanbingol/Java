package OOP.chapter9_interfaces.calculator.calculator1;

public class CosFunction implements MathFunction{
    private static String name = "Cos";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}
