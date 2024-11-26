package day21;

public class SinglyLL {

    Node head;
    int size=0;
    class Node{
        Node next ;
        int data;

        Node(int data){
            this.data = data;
            size++;
            this.next = null;
        }
    }

    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    public void display(){

        Node current = head;
        while(current != null){
            System.out.print(current.data+"-> ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public  int length(){
        int length=0;

        Node current = head;

        while(current != null){
            current = current.next;
            length++;
        }

        return length;
    }

   public void search(int data){

        Node current = head;

        while(current != null){
            if(current.data == data){
                System.out.println("Data is present");
                return;
            }
            current = current.next;
        }

        System.out.println("data not found!!!!!");
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        size--;
        if(head.next == null) {
            head = null;
            return;
        }


        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }


        currNode.next = null;
    }




    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        // Adding elements to the list
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        // Display the list
        System.out.print("Linked List after adding elements: ");
        list.display();

        // Length of the list
        System.out.println("Length of the list: " + list.length());

        // Search for an element
        System.out.println("Searching for element 20:");
        list.search(20);

        System.out.println("Searching for element 50:");
        list.search(50);

        // Remove the first element
        System.out.println("Removing the first element:");
        list.removeFirst();
        list.display();

        // Remove the last element
        System.out.println("Removing the last element:");
        list.removeLast();
        list.display();

        // Final size of the list
        System.out.println("Final size of the list: " + list.size);

    }
}
