public class ObjectReferencePassing {
    public static void main(String[] args) {
        ObjectReferencePassing o = new ObjectReferencePassing();

        W w = new W();
        w.i = 3;
        w.b = false;

        o.f(w);
        System.out.println("i of w is " + w.i + "  and b of w is " + w.b);  //5 , true
    }

    public void f(W objectW) { // objectW = w
        objectW.i = 5;
        objectW.b = true;

        W ww = new W();
        ww.i = 8;
        ww.b = true;

        objectW = ww;
        objectW.i = 12;
        objectW.b = false;
        System.out.println("i of objectW is " + objectW.i + "  and b of objectW is " + objectW.b);  //12 , false
    }
}

class W {
    int i;
    boolean b;
}
