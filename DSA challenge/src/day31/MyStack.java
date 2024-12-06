package day31;

public class MyStack {

    private int arr[];
    private int size;
    private int top;
    public MyStack(int size){
        this.size = size;
        arr = new int[this.size];
        top = -1;
    }

    public boolean isFull(){
            if(top == size - 1 )
                return true;

            return false;
    }

    public boolean isEmpty(){
        if (top == -1)
            return true;
        return false;
    }

    public void push(int data){
        if (isFull())
            return;

        top++;
        arr[top] = data;
    }

    public void pop(){
        if (isEmpty())
            return;

        top--;
    }

    public void display(){

        if (isEmpty()){
            System.out.println("stack in empty ");
            return;
        }


        for (int i = top; i >= 0 ; i--) {
            System.out.println("| "+arr[i]+" |");
        }
        System.out.println("______");
    }

    public static void main(String[] args) {

        MyStack myStack = new MyStack(5);

        myStack.display();

        myStack.push(20);
        myStack.push(10);
        myStack.push(30);
        myStack.display();

        myStack.pop();
        myStack.display();


    }
}
