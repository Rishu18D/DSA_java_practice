public class stack1 {

    public static void main(String[] args) {

        Stack stack = new Stack();

        // Push Elements
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

        // Bottom
        System.out.println("Bottom Element : " + stack.bottom());

        // Size
        System.out.println("Size : " + stack.size());

        // Count
        System.out.println("Count : " + stack.count());

        // isEmpty
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // isFull
        System.out.println("Is Stack Full? " + stack.isFull());

        // Search
        int index = stack.search(20);

        if (index != -1) {
            System.out.println("20 found at index : " + index);
        } else {
            System.out.println("20 not found.");
        }

        // Maximum
        System.out.println("Maximum Element : " + stack.maximum());

        System.out.println();

        // Pop
        System.out.println("Popped Element : " + stack.pop());

        System.out.println();

        // Display Again
        stack.display();
    }
}

class Stack {

    int[] arr = new int[6];
    int top = -1;

    // 1. Push
    public void push(int value) {

        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    // 2. Pop
    public int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    // 3. Peek
    public int peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // 4. isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // 5. isFull
    public boolean isFull() {
        return top == arr.length - 1;
    }

    // 6. Size
    public int size() {
        return top + 1;
    }

    // 7. Display
    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack (Top to Bottom)");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // 8. Search
    public int search(int key) {

        for (int i = top; i >= 0; i--) {

            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    // 9. Count
    public int count() {
        return top + 1;
    }

    // 10. Bottom Element
    public int bottom() {

        if (top == -1) {
            return -1;
        }

        return arr[0];
    }

    // 11. Maximum Element
    public int maximum() {

        if (top == -1) {
            return -1;
        }

        int max = arr[0];

        for (int i = 1; i <= top; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}