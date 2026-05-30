// //Blank final variable-first time jo value denge vo he final ho jaati h
// //final variable


// import java.util.*;
// public class day4 {
//     static class Stack{
//         int top;
//         final int CAPACITY;
//         int stack[];
//         Stack(int size){
//             top=-1;
//             CAPACITY=size;
//             stack=new int[CAPACITY];
//         }
//     static boolean isFull(){
//         if(top==CAPACITY-1){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     static boolean isEmpty(){
//         if(top==-1){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }


//     static void push(int data){
//         if(isFull()){
//             System.out.println("Stack overflow");
//         }else{
//             top++;
//             stack[top]=data;
//             System.out.println("Data pushed successfully");
//         }
//     }
//     static void pop(){
//         if(isEmpty()){
//             System.out.println("Stack underflow");
//         }
//         else{
            
//         }
//     }
//     static void traverse(){
//         if(isEmpty()){
//             System.out.println("Stack underflow");
//         }
//         else{
//             for(int i=top;i>-1;i--){
//                 System.out.println(Stack[top]);
//             }
//         }
//     }
//     static void peek(){
//         if(isEmpty()){
//             System.out.println("Stack underflow");
//         }
//         else{
//                 System.out.println(Stack[top]);
//             }
//         }
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of the stack");
//         int n=sc.nextInt();
//         Stack st=new Stack(n);
//         while(true){
//         System.out.println("Enter the choice that you want to select: ");
//         System.out.println("1.Push");
//         System.out.println("2.Pop");
//         System.out.println("3.Traverse");
//         System.out.println("4.Peek");
//         System.out.println("0.Exit");
//         int choice=sc.nextInt();
//             switch(choice){
//             case 1: System.out.println("enter the data that you want to insert in stack");
//                 int data=sc.nextInt();
//                 st.push();
//                 break;
//             break;
//             case 2:st.pop();
//             break;
//             case 3:st.traverse();
//             break;
//             case 4:st.peek();
//             break;
//             break;
//             case 0:System.exit(0);
//             default:System.out.println("Enter a valid choice!!");
//         }
//         }
//     }
// }


import java.util.*;public class day4 {
    static class Stack {
        int top;
        final int CAPACITY;
        int stack[];

        Stack(int size) {
            top = -1;
            CAPACITY = size;
            stack = new int[CAPACITY];
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
        void pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
            } else {
                System.out.println("Deleted element: " + stack[top]);
                top--;
            }
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
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Traverse");
            System.out.println("4. Peek");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data to push:");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.traverse();
                    break;
                case 4:
                    st.peek();
                    break;
                case 0:
                    System.out.println("Program terminated");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}