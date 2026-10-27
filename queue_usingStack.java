import java.util.Stack;

public class queue_usingStack {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        // Enqueue operations
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(60);

        System.out.println("Queue elements:");
        queue.display();

        System.out.println("Front : " + queue.peek());

        System.out.println("Removed : " + queue.pop());

        System.out.println("Queue after removal:");
        queue.display();

        System.out.println("Front : " + queue.peek());

        System.out.println("Is Empty : " + queue.empty());
    }
}

// Queue using Two Stacks
class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue
    public void push(int value) {

        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push new element
        stack1.push(value);

        // Move all elements back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Dequeue
    public int pop() {

        if (stack1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return stack1.pop();
    }

    // Peek
    public int peek() {

        if (stack1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return stack1.peek();
    }

    // Empty Check
    public boolean empty() {
        return stack1.isEmpty();
    }

    // Display Queue
    public void display() {

        if (stack1.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        // Top to Bottom (Queue Order)
        for (int i = stack1.size() - 1; i >= 0; i--) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }
}