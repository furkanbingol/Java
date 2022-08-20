package OOP.chapter6.string;

public class StringPerformanceTest {
    public static void main(String[] args) {
		buildStringWithPlus("Java", 100000);
		buildStringWithStringBuilder("Java", 100000);
        buildStringWithStringBuffer("Java",  100000);
    }

    public static void buildStringWithPlus(String string, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            string = string + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("buildStringWithPlus: Time to build string is " + (end - start) + " ms.");
        System.out.println("String length: " + string.length());
    }

    public static void buildStringWithStringBuilder(String string, int count) {
        StringBuilder sb = new StringBuilder(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("buildStringWithStringBuilder: Time to build string is " + (end - start) + " ms.");
        System.out.println("String length: " + sb.toString().length());
    }

    public static void buildStringWithStringBuffer(String string, int count) {
        StringBuffer sb = new StringBuffer(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("buildStringWithStringBuffer: Time to build string is " + (end - start) + " ms.");
        System.out.println("String length: " + sb.toString().length());
    }
}
