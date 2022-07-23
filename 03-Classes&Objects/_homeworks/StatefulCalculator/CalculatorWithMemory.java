import OOP.chapter1.calculator.Calculator;

public class CalculatorWithMemory {
    String name;
    int firstArgument;
    int secondArgument;
    double result;
    char operation;

    //Processes(max 50)
    static int processCount = 0;
    int[] firstArguments = new int[50];
    int[] secondArguments = new int[50];
    double[] results = new double[50];
    char[] operations = new char[50];

    Calculator calculator = new Calculator();  //importing

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    void whoAreYou() {
        System.out.println("I'm a Calculator, my name is " + name);
    }

    public int getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(int newFirstArgument) {
        firstArgument = newFirstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(int newSecondArgument) {
        secondArgument = newSecondArgument;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char newOperation) {
        operation = newOperation;
    }


    public int[] getFirstArguments() {
        return firstArguments;
    }

    public int[] getSecondArguments() {
        return secondArguments;
    }

    public double[] getResults() {
        return results;
    }

    public char[] getOperations() {
        return operations;
    }


    public double getResult() {
        switch (operation) {
            case '+':
                result = calculator.add(firstArgument, secondArgument);
                break;
            case '-':
                result = calculator.subtract(firstArgument, secondArgument);
                break;
            case '*':
                result = calculator.multiply(firstArgument, secondArgument);
                break;
            case '/':
                result = calculator.divide(firstArgument, secondArgument);
                break;
        }
        firstArguments[processCount] = firstArgument;
        secondArguments[processCount] = secondArgument;
        results[processCount] = result;
        operations[processCount] = operation;
        processCount++;
        return result;
    }
}
