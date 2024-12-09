package day34;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;


    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }

    public int pop() {
        if (empty())
            throw new RuntimeException("stack is empty");

        return queue1.remove();

    }

    public int top() {

        if (empty())
            throw new RuntimeException("stack is empty");

        return queue1.peek();

    }

    public boolean empty() {
        return queue1.isEmpty();

    }

    public void display(){
        if (empty()){
            System.out.println("stack is empty");
            return;
        }

        System.out.println(queue1);

    }


    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();


        stackUsingQueue.push(10);

        stackUsingQueue.display();
        stackUsingQueue.push(20);
        stackUsingQueue.push(30);
        stackUsingQueue.push(40);
        stackUsingQueue.display();


    }
}
