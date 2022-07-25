public class Tree {
    String type;
    float height;

    public Tree(String type) {                //overloaded constructors
        this.type = type;
    }

    public Tree(String type, float height) {  //overloaded constructors
        this.type = type;
        this.height = height;
    }

    public void printInfo(){
        System.out.println("\nTree Info:");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }


    public static void main(String[] args) {
        Tree tree1 = new Tree("Oak");
        Tree tree2 = new Tree("Pine",5f);

        tree1.printInfo();
        tree2.printInfo();
    }
}
