public class Tree {  //No constructor method
    String type;
    float height;

    //Compiler defines a 'default constructor' (in .class file)
    //public Tree() {}

    public void printInfo(){
        System.out.println("Type: " + type + ", height: " + height);
    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.printInfo();   //type: null , height: 0.0
        tree.type = "Oak";
        tree.height = 8.74f;
        tree.printInfo();   //type: Oak , height: 8.74
    }
}
