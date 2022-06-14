package Arrays;

public class Array101 {
    //Class Members(fields)
    static int[] intArray = new int[10];
    static Pizza[] pizzas = new Pizza[3];
    static boolean[] flags = {true,false};

    public static void main(String[] args) {
        initializeArrays();
        printArrays();
    }

    public static void initializeArrays(){
        System.out.println("Initializing Arrays");

        for(int i = 0; i < intArray.length; i++){
            int rand = (int)(Math.random() * 100);  //0 - 100
            intArray[i] = rand;
        }

        pizzas[0] = new Pizza("Peynirli");
        pizzas[1] = new Pizza("Sucuklu");
        pizzas[2] = new Pizza("Sebzeli");
    }

    public static void printArrays(){
        System.out.println("Printing Arrays: ");

        //FOREACH(read-only)
        for(int i : intArray){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Pizzas: " + pizzas[0].name + " " + pizzas[1].name + " " + pizzas[2].name);
        Pizza p = pizzas[0];

        System.out.println("First Pizza: " + p.name);   //sadece p yazsaydık:  Arrays.Pizza@7530d0a

        System.out.println("First element of 'flags' is: " + flags[0]);
    }
}

class Pizza{        //not write public! Because only 1 "public class" valid in 1 File.
    String name;

    Pizza(String name){
        this.name = name;
    }
}
