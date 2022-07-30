import java.util.Random;

public class InitializationBlocks {
    double d;
//	d = 3.145;    //Can't do this. Use initializers instead.

    {
        System.out.println("\nIn an instance initializer block-1.");
        d = calculateD();
    }

    int l;

    {
        long l = 5; // 'Local var(l)' that shadows 'instance var(this.l)'
        System.out.println("\nIn an instance initializer block-2.");
        Random random = new Random();
        l = random.nextLong();
        this.l = (int) (Math.abs(l) % 100);
    }

    String s;

    {
        System.out.println("\nIn an instance initializer block-3.");
        s = new String("Javaa!");
    }

    static int i;

    static {   //if main is empty, still runs these block
        System.out.println("In a static initializer block.");
        double d = Math.random();
        int i; // Local var that shadows static var
        if(d < 0.5)
            i = 5;
        else
            i = 10;
        InitializationBlocks.i = i;
    }

    static int[] arr = new int[10];

    static {   //if main is empty, still runs these block
        System.out.println("\nInitializing the static array.");
        for (int i = 0; i < arr.length; i++)
            arr[i] = (i + 1) * 10;
    }

    double calculateD() {
        return (Math.random() * 10);
    }

    void printInfo() {
        System.out.println("\nVariables");
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("i: " + i);
        System.out.println("\nArray");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println("\ns: " + s);
    }

    public static void main(String[] args) {
        ////output: In a static initializer block. Initializing the static array. (main is empty or not)

        new InitializationBlocks();  //output: In an instance initializer block-1, 2, 3.
        new InitializationBlocks();  //output: In an instance initializer block-1, 2, 3.
        InitializationBlocks ib = new InitializationBlocks();   //output: In an instance initializer block-1, 2, 3.
		ib.printInfo();
    }
}
