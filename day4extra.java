import java.util.*;
public class day4extra {
    static class Stack {
        int top;
        final int CAPACITY;
        int stack[];

        Stack(int size) {
            top = -1;
            CAPACITY = size;
            stack = new int[100];
        }
        boolean isFull() {
            return top == CAPACITY - 1;
        }
        boolean isEmpty() {
            return top == -1;
        }
        void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow");
            } else {
                top++;
                stack[top] = data;
                System.out.println("Data pushed successfully");
            }
        }
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
            } else {
                int deleted = stack[top];
                System.out.println("Deleted element: " + deleted);
                top--;
                return deleted;
            }
            return stack[top];
        }
        void traverse() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Stack elements are:");
                for (int i = top; i >= 0; i--) {
                    System.out.println(stack[i]);
                }
            }
        }
        void peek() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
            } else {
                System.out.println("Top element is: " + stack[top]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int n = sc.nextInt();
        Stack st = new Stack(n);
        //reverse an array using stack
        int arr[]={1,2,3,4,5};
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            arr[i]=st.pop();
        }
System.out.println(Arrays.toString(arr));
    }
}