public class StackApp {
    private int[] arr;
    private int top;
    private int maxSize;
    
    public StackApp(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }
    
    public void push(int element) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = element;
    }
    
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = arr[top];
        arr[top--] = -998;  
        return popped;
    }
    
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                if (arr[i] != -998) {  
                    System.out.println(i + " " + arr[i]);
                }
            }
        }
    }
    
    public void swapTwo() {
        if (top < 1) {
            System.out.println("Need at least 2 elements to swap");
            return;
        }
        int temp = arr[top];
        arr[top] = arr[top - 1];
        arr[top - 1] = temp;
    }
    
    public void removeElement(int element) {
        int index = -1;
        for (int i = 0; i <= top; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found in the stack");
        } else {
            for (int i = index; i < top; i++) {
                arr[i] = arr[i + 1];
            }
            arr[top] = -998;
            top--;
            System.out.println("Element removed successfully");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        StackApp stack = new StackApp(5);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        
        System.out.println("\nInput some elements on the stack:");
        stack.push(6);
        stack.push(8);
        stack.push(7);
        stack.push(10);
        stack.display();
        
        System.out.println("\nTop element of the stack: " + stack.peek());
        
        System.out.println("\nPopping an element from the stack:");
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        stack.display();
        
        System.out.println("\nSwapping top two elements:");
        stack.swapTwo();
        stack.display();
        
        System.out.println("\nRemoving element 8:");
        stack.removeElement(8);
        stack.display();
        
        System.out.println("\nIs the stack empty? " + stack.isEmpty());
    }
}