package OOP.chapter9_interfaces.calculator.calculator2;

public class SinFunction extends AbstractMathFunction {

    public SinFunction() {
        name = "Sin";
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
