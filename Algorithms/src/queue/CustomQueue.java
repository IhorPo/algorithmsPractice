package queue;

public class CustomQueue {
    public static void main(String[] args) {
        QueueC q = new QueueC(10);

        q.peek();
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(31);
        q.enqueue(1);
        q.enqueue(21);

        q.peek();
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.display();
    }
}

/*
* FIFO
* The first item to be inserted will be the first to be removed.
* The back is where the items are inserted
* The front is the part of the queue where items are deleted or peeked.
* */
class QueueC{
    int[] arr;
    int size;
    int front = -1;
    int back = -1;

    QueueC(int size){
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty(){
        return back == -1 && front == -1;
    }

    public boolean isFull(){
        return back == size - 1;
    }
    // Enqueue
    // Adds an item from the back of the queue.
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full");
        } else if (back == -1 && front == -1) {
            front = back = 0;
            arr[back] = item;
        }else{
            back++;
            arr[back] = item;
        }
    }
    // Dequeue
    // Removes an item from the front of the queue.
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else if (back == front) {
            arr[front] = 0;
            back = front = -1;
        }else{
            arr[front] = 0;
            front++;
        }
    }
    // Display all items
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            for(int i = front;i<=back;i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    // Peek
    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Front value is "+arr[front]);
        }
    }
}