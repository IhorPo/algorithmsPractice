package linkedList;

public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedListC<Integer> c = new LinkedListC<>();
        c.addFirst(1);
        c.addLast(11);
        c.addLast(12);
        c.addLast(24);
        c.add(5,2);
        c.add(6,5);
        c.add(4,7);
        c.print();
        c.deleteFirst();
        c.deleteLast();
        c.print();
    }
}

class LinkedListC<Value>{
    class Node{
        Value value;
        Node next;
        Node(Value value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }
    // addFirst
    public void addFirst(Value value){
        if(isEmpty()){
            head = new Node(value);
            tail = head;
        }else{
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }
    // addLast
    public void addLast(Value value){
        if(isEmpty()){
            head = new Node(value);
            tail = head;
        }else{
            Node newNode = new Node(value);
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            tail = current.next;
        }
    }
    // add(position,value)
    public void add(int pos, Value value){
        if(pos == 1){
            addFirst(value);
        }else if(pos<1){
            System.out.println("Wrong position");
        }else{
            int count = 1;
            Node newNode = new Node(value);
            Node temp = head;
            while(count < pos-1){
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    // deleteFirst
    public Value deleteFirst(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }else{
            Node n = head;
            head = head.next;
            n.next = null;
            if(isEmpty()){
                tail = null;
            }
            return n.value;
        }
    }
    // deleteLast
    public Value deleteLast(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }else if(head == tail){
            Value v = head.value;
            head = null;
            tail = null;
            return v;
        }else{
            Node current = head;
            Node prev = null;
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;
            tail = prev;
            return tail.value;
        }
    }
    // delete
    public Value delete(int pos){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        } else if (pos == 1) {
            return deleteFirst();
        }else{
            int count = 1;
            Node current = head;
            Node prev = null;
            while(count < pos){
                prev = current;
                current = current.next;
                count++;
            }
            prev.next = current.next;
            if(current.next == null){
                tail = prev;
            }
            current.next = null;
            return current.value;
        }
    }
    // search
    public boolean search(Value value){
        Node current = head;
        while(current != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    // print
    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

}