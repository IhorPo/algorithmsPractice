package heap.maxHeap;

import java.util.Arrays;

public class MaxHeapExample {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(10);
        h.add(6);
        h.add(3);
        h.add(7);
        h.add(23);
        h.add(45);
        h.add(2);
        h.add(7);

        h.print();
    }
}
class MaxHeap{
    private int size;
    private int capacity;
    private int[] items;
    MaxHeap(int capacity){
        this.capacity = capacity;
        items = new int[capacity];
        size = 0;
    }

    public int getLeftChildIndex(int parentIndex){return parentIndex*2 + 1;}
    public int getRightChildIndex(int parentIndex){return parentIndex*2 + 2;}
    public int getParentIndex(int index){return (index-2) / 2;}

    public boolean hasLeftChild(int index){return getLeftChildIndex(index) < size;}
    public boolean hasRightChild(int index){return getRightChildIndex(index) < size;}
    public boolean hasParent(int index){return getParentIndex(index) >= 0;}

    public int leftChild(int index){return items[getLeftChildIndex(index)];}
    public int rightChild(int index){return items[getRightChildIndex(index)];}
    public int parent(int index){return items[getParentIndex(index)];}

    public void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    public void ensureCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity*2);
            capacity *= 2;
        }
    }

    public int peek(){
        if(size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll(){
        if(size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item){
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyUp(){
        int index = size - 1;
        while(hasParent(index) && items[index] > parent(index)){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int biggerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) > leftChild(index)){
                biggerChildIndex = getRightChildIndex(index);
            }
            if(items[index] > items[biggerChildIndex]){
                break;
            }else{
                swap(index, biggerChildIndex);
            }
            index = biggerChildIndex;
        }
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}