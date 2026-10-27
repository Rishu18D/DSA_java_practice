import java.util.*;

public class stack_ArrayList {

    public static void main(String[] args) {

        Stack stack = new Stack();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();

        // Display
        stack.display();

        System.out.println();

        // Peek
        System.out.println("Top Element : " + stack.peek());

        // Size
        System.out.println("Size : " + stack.size());

        // isEmpty
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // isFull
        System.out.println("Is Stack Full? " + stack.isFull());

        System.out.println();

        // Pop
        System.out.println("Popped Element : " + stack.pop());

        System.out.println();

        // Display Again
        stack.display();
    }
}

class Stack {

    ArrayList<Integer> list = new ArrayList<>();
    int capacity = 5; // Maximum size (for learning)

    // Push
    public void push(int value) {

        if (list.size() == capacity) {
            System.out.println("Stack Overflow");
            return;
        }

        list.add(value);
        System.out.println(value + " pushed into stack.");
    }

    // Pop
    public int pop() {

        if (list.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return list.remove(list.size() - 1);
    }

    // Peek
    public int peek() {

        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return list.get(list.size() - 1);
    }

    // Size
    public int size() {
        return list.size();
    }

    // isEmpty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // isFull (only because we set a capacity)
    public boolean isFull() {
        return list.size() == capacity;
    }

    // Display
    public void display() {

        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack (Top to Bottom)");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}