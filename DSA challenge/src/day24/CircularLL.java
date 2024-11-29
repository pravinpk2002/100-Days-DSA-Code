package day24;

public class CircularLL {

    Node head;

    public class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head; // Circular reference
            return;
        }

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        
        newNode.next = head;
        current.next = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            node.next = head;
            return;
        }

        Node current = head;

        while (current.next != head){
            current =current.next;
        }
        node.next = head;
        current.next = node;

    }

    public void display(){
        if(head != null){

            Node current = head;
            System.out.println();
            do{
                System.out.print(current.data+" ->");
                current = current.next;
            }while (current != head);
            System.out.print(" Head");
            System.out.println();
            return;
        }

        System.out.println("List is empty");
    }

    public void delete(int data){
        if (head == null){
            System.out.println("list is empty nothing to delete");
            return;
        }

        Node current = head;
        if(head.data == data){
            if(head.next == head){
                head = null;
            }else{

                while (current.next != head){

                    current = current.next;
                }

                current.next = head.next;
                head = head.next;
            }

            return;
        }

        while (current.next != head && current.next.data != data){
            current = current.next;
        }
        if (current.next.data == data) {
            current.next = current.next.next;
        } else {
            System.out.println("Element " + data + " not found in the list");
        }
    }

    void search(int data){
        if(head == null ){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do{
            if(current.data == data){
                System.out.println("data is present");
                return;
            }
            current = current.next;

        }
        while(current != head);

        System.out.println("data is not present ");

    }


    public static void main(String[] args) {

        CircularLL list = new CircularLL();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();

        list.addLast(50);
        list.display();

        list.delete(50);
        list.display();

        list.search(23);

        list.search(10);

    }
}
