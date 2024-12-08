package day33;

public class CircularQueue {

    private int size;
    private int arr[];
    private int front;
    private int rear;


    public CircularQueue(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }
    public boolean isEmpty(){
        if (rear == -1)
            return true;

        return false;
    }


    public boolean isFull(){
        if((rear == size - 1 && front == 0) || (rear == front -1))
            return true;

        return false;
    }

    public void enqueue(int data){
        if(isFull())
            return;

        if(rear == -1 ){
            rear++;
            front++;
        }else if(rear == size - 1){
            rear = 0;
        }
        else{
            rear++;

        }
        arr[rear] = data;

    }

    public void dequeue(){
        if (isEmpty())
            return;

        if(rear == front )
            rear = front = -1;
        else if (front == size -1 )
            front = 0;
        else
            front++;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty nothing to show!!!");
            return;
        }

        int index = front;

        while(index != rear){
            System.out.print(arr[index]+" ");
            if(index == size - 1)
                index = 0;
            else
                index++;

        }
        System.out.print(arr[index]);
        System.out.println();
    }


    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.display();

        // Enqueue elements
        System.out.println("Enqueueing elements:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Display the queue
        System.out.print("Queue after enqueueing elements: ");
        queue.display();

        // Try enqueueing when the queue is full
        System.out.println("Trying to enqueue when the queue is full:");
        queue.enqueue(60); // This should not be added
        queue.display();

        // Dequeue an element
        System.out.println("Dequeuing one element:");
        queue.dequeue();
        queue.display();

        // Enqueue more elements
        System.out.println("Enqueueing more elements:");
        queue.enqueue(60);
        queue.enqueue(70);
        queue.display();




    }
}
