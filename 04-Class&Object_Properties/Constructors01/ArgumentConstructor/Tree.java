public class Tree {
    String type;
    float height;

    public Tree(String type, float height){   //Smart Constructor(Argument Constructor)
        this.type = type;
        this.height = height;
    }

    public void printInfo(){
        System.out.println("Type: " + type + ", height: " + height);
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree("Pine",2.0f);
        Tree tree2 = new Tree("Oak",5.5f);
        //Tree tree3 = new Tree();   //compiler error

        tree1.printInfo();
        tree2.printInfo();
    }
}
