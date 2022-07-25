public class Tree {
    String type;
    float height;

    public Tree(String type, float height) {
        this.type = type;
        this.height = height;
    }

    public Tree copy() {
        Tree copyTree = new Tree(type, height);  //Aynı özelliklere sahip, BAŞKA bir nesne oluşturur.
        return copyTree;
    }

    public Tree grow() {
        height++;
        return this;    //Başka nesne oluşturmadan, o anki nesnenin heightini 1 arttırıp, aynı nesneyi döndürür.
    }

    public void printInfo() {
        System.out.println("\nType Info: ");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }


    public static void main(String[] args) {
        Tree tree = new Tree("Pine",15.0f);
        tree.printInfo();
        Tree copy = tree.copy();
        copy.printInfo();
        Tree grown = tree.grow();
        grown.printInfo();

        System.out.println();

        if(tree == copy)   //Check if they point to the same object(result: Different)
            System.out.println("Same, tree == copy");
        else
            System.out.println("Different, tree != copy");


        if(tree == grown)  //Check if they point to the same object(result: Same)
            System.out.println("Same, tree == grown");
        else
            System.out.println("Different, tree != grown");
    }
}
