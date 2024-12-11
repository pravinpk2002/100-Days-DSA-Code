package day36;


import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stack1 ;
    private Stack<Integer> stack2 ;
    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {

        stack1.push(x);

    }

    public int pop() {

        if (stack1.isEmpty() && stack2.isEmpty())
            throw new RuntimeException("Queue is empty");

       if(stack2.isEmpty()){
           while (!stack1.isEmpty())
               stack2.push(stack1.pop());
       }

       return stack2.pop();


    }

    public int peek() {

        if (stack2.isEmpty()){
            if ( stack1.isEmpty())
                throw new RuntimeException("Queue is empty");

            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }


        return stack2.peek();

    }

    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }
    
    void display(){

        System.out.println("Stack1: " + stack1);
        System.out.println("Stack2: " + stack2);
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.display();
        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Pop: " + queue.pop());
        System.out.println("Peek: " + queue.peek());
    }
}
