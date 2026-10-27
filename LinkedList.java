public class LinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(60);


        System.out.println("Original Linked List:");
        list.display();


        System.out.println("\nCount:");
        System.out.println(list.count());


        System.out.println("\nSearch 20:");
        System.out.println(list.search(20));


        list.insertStart(5);

        System.out.println("\nAfter adding at start:");
        list.display();



        list.insertEnd(50);

        System.out.println("\nAfter adding at end:");
        list.display();



        list.insertPosition(3, 25);

        System.out.println("\nAfter adding at position 3:");
        list.display();



        list.deleteStart();

        System.out.println("\nAfter deleting first:");
        list.display();



        list.deleteEnd();

        System.out.println("\nAfter deleting last:");
        list.display();



        list.deletePosition(2);

        System.out.println("\nAfter deleting position 2:");
        list.display();

    }



    // Node class
    static class Node {

        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    private Node head = null;



    // Display Linked List
    void display() {

        Node temp = head;


        while(temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }


        System.out.println("null");
    }



    // Count nodes
    int count() {

        int count = 0;

        Node temp = head;


        while(temp != null) {

            count++;

            temp = temp.next;
        }


        return count;
    }



    // Search node
    boolean search(int value) {

        Node temp = head;


        while(temp != null) {

            if(temp.data == value) {
                return true;
            }

            temp = temp.next;
        }


        return false;
    }



    // Insert at beginning
    void insertStart(int data) {

        Node newNode = new Node(data);


        newNode.next = head;

        head = newNode;
    }



    // Insert at end
    void insertEnd(int data) {

        Node newNode = new Node(data);


        if(head == null) {

            head = newNode;

            return;
        }


        Node temp = head;


        while(temp.next != null) {

            temp = temp.next;
        }


        temp.next = newNode;
    }



    // Insert at position
    void insertPosition(int position, int data) {


        if(position <= 1) {

            insertStart(data);

            return;
        }


        Node newNode = new Node(data);

        Node temp = head;


        for(int i = 1; i < position - 1 && temp != null; i++) {

            temp = temp.next;
        }


        if(temp == null) {

            System.out.println("Invalid position");

            return;
        }


        newNode.next = temp.next;

        temp.next = newNode;
    }



    // Delete first node
    void deleteStart() {

        if(head == null) {
            return;
        }


        head = head.next;
    }



    // Delete last node
    void deleteEnd() {


        if(head == null) {
            return;
        }


        if(head.next == null) {

            head = null;

            return;
        }


        Node temp = head;


        while(temp.next.next != null) {

            temp = temp.next;
        }


        temp.next = null;
    }



    // Delete position
    void deletePosition(int position) {


        if(head == null) {
            return;
        }


        if(position == 1) {

            deleteStart();

            return;
        }


        Node temp = head;


        for(int i = 1; i < position - 1 && temp != null; i++) {

            temp = temp.next;
        }


        if(temp == null || temp.next == null) {

            System.out.println("Invalid position");

            return;
        }


        temp.next = temp.next.next;
    }

}