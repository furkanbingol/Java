public class Calculator {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void whoAreYou(){
        System.out.println("I'm a Calculator, my name is: " + name);
    }

    public int add(int first, int second){
        return first + second;
    }

    public int subtract(int first, int second){
        return  first - second;
    }

    public int multiply(int first, int second){
        return first * second;
    }

    public int multiplyByAdding(int first, int second){
        int multip = 0;
        for(int i = 1; i <= second; i++)
            multip += first;
        System.out.println("Multiplication by adding : " + multip);
        return multip;
    }

    public double divide(int first, int second){
        return (double)first / second;
    }

    public int power(int base, int power){
        int result = 1;
        for(int i = 1; i <= power; i++)
            result *= base;
        return result;
    }

    public int mod(int first, int second){
        return first % second;
    }

    public int factorial(int n){
        int fact = 1;
        if(n < 0)
            return -1;
        while(n != 0){
            fact *= n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setName("T-308");

        calculator.whoAreYou();
        int i = calculator.add(10,40);
        System.out.println("10 + 40 = " + i);

        double d = calculator.divide(100,9);
        System.out.println("100 / 9 = " + d);

        calculator.multiplyByAdding(9,8);  //Calling it for its "side effect"

        System.out.println(calculator.power(2, 6));
        System.out.println(calculator.mod(36,6));
        System.out.println(calculator.factorial(6));
    }
}
