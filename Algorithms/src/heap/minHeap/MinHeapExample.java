package heap.minHeap;

import java.util.Arrays;

public class MinHeapExample {
    public static void main(String[] args) {

    }
}
class MinHeap{
    private int capacity;
    private int size;
    private int[] items;
    MinHeap(int capacity){
        size = 0;
        this.capacity = capacity;
        items = new int[capacity];
    }
    public int getLeftChildIndex(int parentIndex){return parentIndex*2 + 1;}
    public int getRightChildIndex(int parentIndex){return parentIndex*2 + 2;}
    public int getParentIndex(int parentIndex){return (parentIndex - 2) / 2;}

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

    public void ensureExtraCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity*2);
            capacity *= 2;
        }
    }

    public int peek(){
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll(){
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyUp(){
        int index = size-1;
        while(hasParent(index) && parent(index) > items[index]){
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    public void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }
            if(items[index] < items[smallerChildIndex]){
                break;
            }else{
                swap(smallerChildIndex, index);
            }
            index = smallerChildIndex;
        }
    }
}