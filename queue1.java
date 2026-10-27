import java.util.ArrayList;

public class queue1 {

    public static void main(String[] args) {

        Queue q = new Queue();

        // Enqueue operations
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(60);

        System.out.println("Queue elements:");
        q.display();

        // Peek operation
        System.out.println("Front element: " + q.peek());

        // Dequeue operation
        System.out.println("Removed element: " + q.dequeue());

        System.out.println("Queue after dequeue:");
        q.display();

        // Size operation
        System.out.println("Queue size: " + q.size());

        // Empty check
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}

// Queue class
class Queue {

    private ArrayList<Integer> queue = new ArrayList<>();

    // Enqueue
    public void enqueue(int value) {
        queue.add(value);
    }

    // Dequeue
    public int dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue.remove(0);
    }

    // Peek
    public int peek() {

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue.get(0);
    }

    // Size
    public int size() {
        return queue.size();
    }

    // Empty check
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Display
    public void display() {

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int value : queue) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}