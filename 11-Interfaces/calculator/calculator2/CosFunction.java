package OOP.chapter9_interfaces.calculator.calculator2;

public class CosFunction extends AbstractMathFunction {

    public CosFunction() {
        name = "Cos";
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}
