package OOP.chapter9_interfaces.calculator.calculator1;

public class SquaredFunction implements MathFunction{
    private static String name = "Squared";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.sqrt(arg);
    }
}
