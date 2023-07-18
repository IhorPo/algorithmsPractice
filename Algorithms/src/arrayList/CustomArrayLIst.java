package arrayList;

import java.util.Arrays;

public class CustomArrayLIst {
    private int size;
    private int capacity;
    private int[] arr;

    public CustomArrayLIst(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException("Illegal size");
        }
        arr = new int[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public int size(){
        return this.size;
    }

    public void ensureExtraCapacity(){
        if(size == capacity){
            arr = Arrays.copyOf(arr,capacity*2);
            capacity *= 2;
        }
    }

    public void add(int item){
        ensureExtraCapacity();
        arr[size] = item;
        size++;
    }

    public void add(int index, int item){
        if(index < 0 || index >= capacity){
            throw new IllegalArgumentException("Illegal index");
        }
        ensureExtraCapacity();
        System.arraycopy(arr, index, arr,index+1,size-index);
        arr[index] = item;
        size++;
    }

    public void addAll(int[] arr1){
        if(size + arr1.length > capacity){
            ensureExtraCapacity();
        }
        for(int i=0;i<arr1.length;i++){
            arr[size++] = arr1[i];
        }
    }

    public void delete(int index){
        if(index > 0 && index < size){
            for(int i=index;i<size;i++){
                arr[i] = arr[i+1];
            }
        }
        size--;
    }

    public void delete(){
        arr[size] = 0;
        size--;
    }

    public void deleteAll(){
        for(int i=size;i>0;i--){
            arr[i] = 0;
            size--;
        }
    }

    public void set(int index, int value){
        if(index < 0 || index >= capacity){
            throw new IllegalArgumentException("Illegal index");
        }
        ensureExtraCapacity();
        arr[index] = value;
    }

    public String searchValue(int value){
        String res = "";
        boolean inList = false;

        for(int i=0;i<size;i++){
            if(arr[i] == value){
                inList = true;
                res += i + " ";
            }
        }

        if(!inList){
            return "None";
        }

        return "At indexes "+ res;
    }

    public void printArr(){
        if(size == 0){
            System.out.println("[]");
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        CustomArrayLIst a = new CustomArrayLIst(10);

        a.add(3);
        a.add(2);
        a.add(5);
        a.add(3);
        a.add(1);
        a.add(1);

        a.printArr();

        a.add(1,100);

        a.printArr();

        a.set(1,99);

        a.printArr();

        a.delete(1);

        a.printArr();

        System.out.println(a.searchValue(3));

        a.delete();

        a.printArr();

        int[] arr = {9,9,9};
        a.addAll(arr);

        a.printArr();
    }
}
