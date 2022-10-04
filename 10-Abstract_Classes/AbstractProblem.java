package OOP.chapter8_abstractclasses;

//class'ı final yapamayız, çünkü subclasslar bu class'ı devralmalı!
public abstract class AbstractProblem {

    //private abstract void method1();              //abstract metotların modifierları sadece "public,default veya protected" olabilir!
    //public static abstract void method2();
    //public synchronized abstract void method3();

    public abstract void anotherMethod();
    abstract void anotherMethod2();
    protected abstract void anotherMethod3();

    public static void main(String[] args) {
        System.out.println("I love Java!");
    }
}
