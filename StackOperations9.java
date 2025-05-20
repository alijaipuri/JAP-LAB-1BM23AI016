interface Stack {
    void push(int element);
    int pop();
    boolean isEmpty();
    int size();
}

class FixedLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public FixedLengthStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
            return;
        }
        stackArray[++top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}

class DynamicLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public DynamicLengthStack() {
        this.capacity = 10;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (top == capacity - 1) {
            capacity *= 2;
            int[] newStackArray = new int[capacity];
            System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);
            stackArray = newStackArray;
        }
        stackArray[++top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack fixedStack = new FixedLengthStack(5);
        System.out.println("Fixed Length Stack Operations:");
        performStackOperations(fixedStack);

        Stack dynamicStack = new DynamicLengthStack();
        System.out.println("\nDynamic Length Stack Operations:");
        performStackOperations(dynamicStack);
    }

    public static void performStackOperations(Stack stack) {
        System.out.println("Stack Size: " + stack.size());
        stack.push(10);
        System.out.println("Stack Size: " + stack.size());
        stack.push(20);
        System.out.println("Stack Size: " + stack.size());
        stack.push(30);
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
/*Output:
Fixed Length Stack Operations:
Stack Size: 0
Stack Size: 1
Stack Size: 2
Stack Size: 3
Pop: 30
Stack Size: 2
Pop: 20
Stack Size: 1
Is Empty: false
Stack Size: 1
Pop: 10
Stack Size: 0
Is Empty: true
Dynamic Length Stack Operations:
Stack Size: 0
Stack Size: 1
Stack Size: 2
Stack Size: 3
Pop: 30
Stack Size: 2
Pop: 20
Stack Size: 1
Is Empty: false
Stack Size: 1
Pop: 10
Stack Size: 0
Is Empty: true */
