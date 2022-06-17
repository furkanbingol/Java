package Arrays.homeworks;

public class Queue {
    public static final int MAX_QUEUE_SIZE = 10;
    String[] queue = new String[MAX_QUEUE_SIZE];
    int front = -1;
    int rear = -1;

    public static void main(String[] args) {
        Queue fCall = new Queue();
        fCall.queue("Galatasaray");
        fCall.queue("Fenerbahce");
        fCall.queue("Besiktas");
        System.out.println("Queue max capacity: " + fCall.getCapacity());
        System.out.println("Instant size: " + fCall.size());
        fCall.dequeue();
        fCall.showElements();
        fCall.clear();
        fCall.showElements();
    }

    public void queue(String newElement){
        if(!isFull()){
            if(front == -1)
                front++;
            queue[++rear] = newElement;
        }
        else
            System.out.println("Queue is full!");
    }

    public void dequeue(){
        if(!isEmpty()){
            System.out.println("Deleted element from queue: " + queue[front]);
            if(rear == 0){
                front--;
                rear--;
            }
            else if(front < rear){
                front++;
            }
            else if(front == rear){
                clear();
            }
        }
        else
            System.out.println("Queue is empty!");
    }

    public void clear(){
        System.out.println("Queue is cleaning!");
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return (rear == -1);
    }

    public boolean isFull(){
        return (rear == MAX_QUEUE_SIZE-1);
    }

    public int size(){
        return (rear+1);
    }

    public int getCapacity(){
        return MAX_QUEUE_SIZE;
    }

    public void showElements(){
        if(!isEmpty()){
            System.out.print("Queue status:  ");
            for(int i = front; i <= rear; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
        else
            System.out.println("Queue is empty!");
    }
}
