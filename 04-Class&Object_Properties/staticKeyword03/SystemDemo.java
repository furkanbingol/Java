public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("System.out.println");
        System.err.println("System.err.println");

        System.out.println("User home dir: " + System.getProperty("user.home"));
        System.out.println("User workind dir: " + System.getProperty("user.dir"));
        System.out.println("Java version: " + System.getProperty("java.version"));      //17.0.2
        System.out.println("Line separator: " + System.lineSeparator());
        System.out.println("Path separator: " + System.getProperty("path.separator"));  //; in windows

        long start = System.currentTimeMillis();

        long sum = 0;
        for(long i = 0; i < 1_000_000_000; i++)
            sum += i;

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start) + "ms.");

        System.exit(1);  //Process finished with exit code 1
    }
}
