package OOP.chapter4.memberAccess.p;

/*
Access Modifiers:
-public
-private
-protected
-default (hiçbir şey yazmayız) (package private)

Üye alanlar(variables,methods) için access modifierlerın ANLAMI:
public:    her yerden erişilir.
private:   dışarıdan erişime kapalıdır, sadece içinde bulunduğu sınıftan erişilir.
protected: "MİRAS" olarak devralan alt sınıflara erişime açıktır.Paketteki sınıflarda protected üyelere erişebilir.
default:   erişim "sadece paketteki sınıflara" açıktır.
*/

public class ClassP {
    public int x = 10;
    int y = 20;   //default access modifier(package accessible)
    protected int w = 30;
    private int z = 40;

    public void publicMethod(){
        System.out.println(z);
    }

    void defaultMethod(){   //default access modifier(package accessible)
        privateMethod();
    }

    protected void protectedMethod(){
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("private method");
    }
}
