package OOP.chapter5.finals;

public final class FinalClass {
    public void f(){
        System.out.println("f() in FinalClass");
    }
}

// ERROR --> final class CANNOT BE a PARENT CLASS
/* 

class ChildClass extends FinalClass(){

}

*/
