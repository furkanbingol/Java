public class StaticDemo {
    static int i = 10;
    int k;

    public static void increment(){
        StaticDemo.i++;     //access from class!
    }

    public static void setI(int i){
        StaticDemo.i = i;   //access from class!
    }


    public static void main(String[] args) {
        System.out.println("StaticDemo.i: " + i);            //same(cuz of main and StaticDemo's 'i' is STATIC)
        System.out.println("StaticDemo.i: " + StaticDemo.i); //same

        StaticDemo.increment();

        System.out.println("StaticDemo.i: " + StaticDemo.i);


        StaticDemo st1 = new StaticDemo();
        StaticDemo st2 = new StaticDemo();
        //Unethical Access, because 'i' doesn't look like a instance variable(no compile error)
        System.out.println("st1.i: " + st1.i);
        System.out.println("st1.i: " + st2.i);

        //Bir static metot(main), başka bir static metotu(setI) direkt olarak çağırabilir veya Classına ulaşıpta çağırabilir.
        setI(30);             //same
        StaticDemo.setI(30);  //same
        System.out.println("after setI(), StaticDemo.i: " + StaticDemo.i);
    }
}
