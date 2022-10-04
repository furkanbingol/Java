package OOP.chapter7_polymorphism.binding;

public class StaticShadowing {
    public static void main(String[] args) {
        Parent parent = new Child1();
        parent.doIt();      //doIt() function is 'static'. Parent's doIt() is called
        Child1 child1 = new Child1();
        child1.doIt();      //child1's doIt() is called
        Child2 child2 = new Child2();
        child2.doIt();      //child2's doIt() is called

        System.out.println();
        parent = new Child2();
        parent.doIt();      //doIt() function is 'static'. Parent's doIt() is called

        System.out.println();

        System.out.println(Parent.i);  //5
        System.out.println(parent.j);  //9, why isn't 29? ---> fieldlar 'STATIC BIND' edilirler.
        System.out.println(Child1.i);  //15
        System.out.println(child1.j);  //19
        System.out.println(Child2.i);  //25
        System.out.println(child2.j);  //29
    }
}
