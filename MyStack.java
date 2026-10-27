public class MyStack {

    // Main method FIRST
    public static void main(String[] args) {

        MyStack ms = new MyStack(10);

        // Push elements
        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);

        // Display stack
        System.out.println("\nStack:");
        ms.display();

        // Top element
        System.out.println("\nTop element: " + ms.top());

        // Stack size
        System.out.println("Stack size: " + ms.size());

        // Check empty
        System.out.println("Is stack empty? " + ms.isEmpty());

        // Check full
        System.out.println("Is stack full? " + ms.isFull());

        // Second element
        System.out.println("Second element: " + ms.peekSecond());

        // Search
        System.out.println("Position of 7 from top: " + ms.search(7));

        // Pop
        System.out.println("\nPopped element: " + ms.pop());

        // Display after pop
        System.out.println("\nAfter pop operation:");
        ms.display();

        // Top after pop
        System.out.println("\nTop element: " + ms.top());

        // Size after pop
        System.out.println("Stack size: " + ms.size());

        // Display bottom to top
        System.out.println("\nBottom to top:");
        ms.displayBottomToTop();

        // Clear stack
        System.out.println("\nClearing stack...");
        ms.clear();

        // Check if empty
        System.out.println("Is stack empty? " + ms.isEmpty());
    }


    // Variables
    private int[] stack;
    private int top;
    private int capacity;


    // Constructor
    public MyStack(int capacity) {

        this.capacity = capacity;
        stack = new int[capacity];

        top = -1;
    }


    // Push element
    public void push(int value) {

        if (isFull()) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        top++;
        stack[top] = value;

        System.out.println(value + " pushed into stack.");
    }


    // Pop element
    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        int value = stack[top];

        top--;

        return value;
    }


    // Get top element
    public int top() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return stack[top];
    }


    // Check if stack is empty
    public boolean isEmpty() {

        return top == -1;
    }


    // Check if stack is full
    public boolean isFull() {

        return top == capacity - 1;
    }


    // Get stack size
    public int size() {

        return top + 1;
    }


    // Get stack capacity
    public int getCapacity() {

        return capacity;
    }


    // Get second element
    public int peekSecond() {

        if (top < 1) {
            System.out.println("Second element does not exist.");
            return -1;
        }

        return stack[top - 1];
    }


    // Search element
    public int search(int value) {

        for (int i = top; i >= 0; i--) {

            if (stack[i] == value) {
                return top - i + 1;
            }
        }

        return -1;
    }


    // Clear stack
    public void clear() {

        top = -1;

        System.out.println("Stack cleared.");
    }


    // Display stack from top to bottom
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {

            System.out.println(stack[i]);
        }
    }


    // Display stack from bottom to top
    public void displayBottomToTop() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (bottom to top):");

        for (int i = 0; i <= top; i++) {

            System.out.println(stack[i]);
        }
    }

}
