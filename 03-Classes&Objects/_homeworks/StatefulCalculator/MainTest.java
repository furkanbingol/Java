public class MainTest {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();

        calculator.setName("Calculator");
        calculator.setFirstArgument(5);
        calculator.setSecondArgument(10);
        calculator.setOperation('+');
        System.out.println("5 + 10 = " + calculator.getResult());

        calculator.setFirstArgument(11);
        calculator.setSecondArgument(9);
        calculator.setOperation('*');
        System.out.println("11 * 9 = " + calculator.getResult());

        calculator.setFirstArgument(40);
        calculator.setSecondArgument(8);
        calculator.setOperation('/');
        System.out.println("40 / 8 = " + calculator.getResult());

        System.out.println("Getting 3rd process: "
        + calculator.getFirstArguments()[2] + " " + calculator.getOperations()[2] + " "
        + calculator.getSecondArguments()[2]
        + " = " + calculator.getResults()[2]);
    }
}
