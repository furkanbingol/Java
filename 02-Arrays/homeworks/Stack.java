package Arrays.homeworks;

public class Stack {
    public static final int MAX_STACK_SIZE = 10;
    String[] stack = new String[MAX_STACK_SIZE];
    int pointer = 0;

    public static void main(String[] args) {
        Stack fCall = new Stack();
        fCall.push("Furkan");
        fCall.push("Istanbul");
        fCall.push("Galatasaray");
        System.out.println("Stack max capacity: " + fCall.getCapacity());
        System.out.println("Instant size: " + fCall.size());
        fCall.pop();
        fCall.showElements();
        fCall.clear();
        fCall.showElements();
    }

    public void push(String newElement){
        if(!isFull()){
            stack[pointer++] = newElement;
            System.out.println(newElement + " added into stack");
        }
        else
            System.out.println("Stack is Full!");
    }

    public void pop(){
        if(!isEmpty()){
            pointer--;
            System.out.println("Deleted element from stack: " + stack[pointer]);
        }
        else
            System.out.println("Stack is Empty!");
    }

    public void clear(){
        System.out.println("Stack is cleaning...");
        pointer = 0;
    }

    public boolean isEmpty(){
        return (pointer == 0);
    }

    public boolean isFull(){
        return (pointer == MAX_STACK_SIZE);
    }

    public int size(){
        return pointer;
    }

    public int getCapacity(){
        return MAX_STACK_SIZE;
    }

    public void showElements(){
        if(!isEmpty()){
            System.out.print("Stack Status:  ");
            for(int i = 0; i < pointer; i++){
                System.out.print(stack[i] + " ");
            }
        }
        else
            System.out.println("Stack is empty!");
        System.out.println();
    }
}
