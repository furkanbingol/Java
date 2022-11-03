package OOP.chapter9_interfaces.calculator.calculator2;

public class LogFunction extends AbstractMathFunction {

    public LogFunction() {
        name = "Log";
    }

    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }
}
