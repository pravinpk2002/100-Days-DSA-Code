package day22;

public class DoublyLL {

    Node head;

    class Node{
        int data;
    private int size = 0;

        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    void addLast(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        newNode.prev = current;
        current.next = newNode;
    }


    void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        System.out.println();
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ->");
            current = current.next;
        }

        System.out.print("null");
        System.out.println();
    }

    void removeFirst(){

        if(head == null){
            System.out.println("list is already empty");
            return;
        }
         if(head.next == null){
            head = null;
            return;
        }


        head = head.next;
        head.prev = null;

    }

    void removeLast(){

        if(head == null){
            System.out.println("list is already empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;;

        while(current.next != null){
            current = current.next;
        }

        current.prev.next = null;


    }

    void search(int data){

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node current = head;

        while(current != null){

            if(current.data == data){
                System.out.println("data is present");
                return;
            }
            current = current.next;
        }

        System.out.println("data is not present");
    }


    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();

        // Adding elements
        System.out.println("Adding elements at the beginning:");
        list.addFirst(25);  // List: 25 -> null
        list.addFirst(10);  // List: 10 -> 25 -> null
        list.addFirst(30);  // List: 30 -> 10 -> 25 -> null
        list.display();

        System.out.println("\nAdding elements at the end:");
        list.addLast(40);   // List: 30 -> 10 -> 25 -> 40 -> null
        list.addLast(50);   // List: 30 -> 10 -> 25 -> 40 -> 50 -> null
        list.display();

        // Removing elements
        System.out.println("\nRemoving the first element:");
        list.removeFirst(); // Removes 30. List: 10 -> 25 -> 40 -> 50 -> null
        list.display();

        System.out.println("\nRemoving the last element:");
        list.removeLast();  // Removes 50. List: 10 -> 25 -> 40 -> null
        list.display();

        // Searching for elements
        System.out.println("\nSearching for elements:");
        list.search(25);    // Present
        list.search(70);    // Not Present

        // Displaying the list
        System.out.println("\nFinal state of the list:");
        list.display();
    }

}
