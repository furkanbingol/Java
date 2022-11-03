package OOP.chapter9_interfaces.calculator.calculator2;

public abstract class AbstractMathFunction implements MathFunction{

    protected String name;

    @Override
    public final String getName() {
        return name;
    }
}
