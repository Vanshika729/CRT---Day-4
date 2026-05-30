//Queue Implementation
import java.util.*;
class Queue{
    int queue[],size,front,rear;
    public Queue(int n){
     size=n;
     queue=new int[size];
     front=0;
     rear=-1;
    }
    //reverse queue using stack
    public void insert(int data){
       if(isFull()){
        System.out.println("Queue overflow");
       }
       else{
        ++rear;
        queue[rear]=data;
        System.out.println(data+" Data inserted");
       }
    }
    public int delete(){
        int data=queue[front];
        if (isEmpty()) {
            System.out.println("Queue underflow");
        }
        else{
            data=queue[front];
            for(int i=1;i<=rear;i++){
            queue[i-1]=queue[i];
       }--rear;
        }
       return data;
    }
    public void display(){
      if(isEmpty()){
        System.out.println("Queue underflow");
      }
      else{
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
      }
    }
    public int peek(){
    return queue[front];
    }
    public boolean isFull(){
       if(rear==size-1)
        return true;
       else
        return false;
    }
    public boolean isEmpty(){
        if(rear==-1)
        return true;
       else
        return false;
    }


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
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the size of Queue: ");
        // int n=sc.nextInt();
        // int data; boolean b;
        // Queue obj=new Queue(n);
        // while(true){
        //     System.out.println("\n1. Insert");
        //     System.out.println("2. Delele");
        //     System.out.println("3. Display");
        //     System.out.println("4. Peek");
        //     System.out.println("0. Exit");
        //     int ch=sc.nextInt();
        //     switch(ch){
        //     case 1: System.out.println("Enter data: ");
        //             data=sc.nextInt();
        //             obj.insert(data);
        //             break;
        //     case 2: data=obj.delete();
        //             System.out.println(data+" is Deleled");
        //             break;
        //     case 3: obj.display();
        //             break;
        //     case 4: data=obj.peek();
        //     System.out.println(data);
        //             break;
        //     case 0: System.exit(0);
        //     }
        // }

        int arr[]={1,2,3,4,5};
        Queue obj=new Queue(arr.length);
        Stack st = new Stack(arr.length);
        for(int i=0;i<arr.length;i++){
            obj.insert(arr[i]);
        }
        int c1=obj.rear+1;
        for(int i=0;i<c1;i++){
            st.push(obj.delete());
        }
        int c2=st.top;
        for(int i=c2;i>=0;i--){
            obj.insert(st.pop());
        }
        System.out.println(Arrays.toString(obj.queue));
    }
}
