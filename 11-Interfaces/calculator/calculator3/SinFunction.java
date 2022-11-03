package OOP.chapter9_interfaces.calculator.calculator3;

public class SinFunction implements SingleArgMathFunction {
    private static String name = "Sin";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
