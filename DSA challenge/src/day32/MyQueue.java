package day32;

public class MyQueue {

    private int size;
    private int arr[];
    private int rear;
    private int front;
    public MyQueue(int size){
        this.size = size;
        arr = new int[size];
        this.front = -1;
        this.rear = -1;

    }

    public boolean isFull(){
        if(rear == size -1){
            return true;
        }

        return false;
    }

    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }

        return false;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }

        if(rear == -1){
            rear++;
            front++;
            arr[rear] = data;
            return;
        }

        rear++;
        arr[rear] = data;

    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        front++;
        if (front > rear){
            rear = -1;
            front = -1;
        }

    }

    public void display(){
        if (isEmpty()){
            System.out.println("queue is empty nothing to display");
            return;
        }

        for (int i = front; i <= rear ; i++) {
            System.out.print(arr[i]+" - ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        System.out.println("Adding elements to the queue:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        System.out.println("Attempting to add another element to a full queue:");
        queue.enqueue(60);

        System.out.println("Removing elements from the queue:");
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();

        System.out.println("Attempting to remove an element from an empty queue:");
        queue.dequeue();

        System.out.println("Adding elements to the queue again:");
        queue.enqueue(100);
        queue.enqueue(200);
        queue.display();
    }

}
