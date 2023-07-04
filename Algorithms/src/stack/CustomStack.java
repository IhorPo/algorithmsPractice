package stack;

public class CustomStack {
    public static void main(String[] args) {
        StackC s = new StackC(10);
        s.push(1);
        s.push(2);
        s.pushMany(new int[]{3,5,4,3});
        s.display();
        s.peek();
        s.pop();
        s.display();
        s.popAll();
        s.display();
        s.peek();
    }
}

class StackC{
    private int top;
    int capacity;
    private int arr[];

    StackC(int size){
        capacity = size;
        top = -1;
        arr = new int[size];
    }

    // isEmpty
    public boolean isEmpty(){
        return top == -1;
    }
    // isFull
    public boolean isFull(){
        return top == capacity - 1;
    }
    // push - adding to the stack
    public void push(int item){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            arr[++top] = item;
        }
    }
    // pushMany
    public void pushMany(int[] list){
        for(int i=0;i<list.length;i++){
            push(list[i]);
        }
    }
    // pop - removing + returning item from the top
    public int pop(){
        if(isEmpty()){
            return -1;
        }else{
            int del = arr[top];
            System.out.println(del + " was deleted");
            arr[top--] = 0;
            return del;
        }
    }
    // popAll
    public void popAll(){
        for(int i=top;i>=0;i--){
            pop();
        }
    }
    // peek - returning item from the top
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Top value is "+arr[top]);
        }
    }
    // display
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i = 0;i<capacity;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}