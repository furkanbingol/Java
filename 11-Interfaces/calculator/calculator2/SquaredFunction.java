package OOP.chapter9_interfaces.calculator.calculator2;

public class SquaredFunction extends AbstractMathFunction {

    public SquaredFunction() {
        name = "Squared";
    }

    @Override
    public double calculate(double arg) {
        return Math.sqrt(arg);
    }
}
