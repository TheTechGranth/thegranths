package DataStructures;

import java.util.Arrays;

public class MinHeap {
    int capacity;
    int size = 0;
    int[] heap;

    public MinHeap() {
        this.capacity = 10;
        heap = new int[capacity];
    }

    private int getLeftChildIndex (int parentIndex) { return (2*parentIndex) + 1; }
    private int getRightChildIndex (int parentIndex) { return (2*parentIndex) + 2; }
    private int getParentIndex(int childIndex) { return (childIndex-1)/2;}

    // here reSizeHeap method can also take a load factor as input
    private void reSizeHeap() {
        if(size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity = capacity * 2;
        }
    }

    public int peek(){
        if (size == 0) throw new IllegalStateException("Empty Heap");
        return heap[0];
    }

    public void insert (int val){
        reSizeHeap();
        heap[size] = val;
        size++;
        heapifyUp();
    }

    public int poll(){
        if (size == 0) throw new IllegalStateException("Empty Heap");
        int val = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifyDown();
        return val;
    }

    private void heapifyDown() {
       int index = 0;
       while(getLeftChildIndex(index) < size){
           int smallerIndex = index;
           if(heap[getLeftChildIndex(index)] < heap[smallerIndex]) smallerIndex = getLeftChildIndex(index);
           if(heap[getRightChildIndex(index)] < heap[smallerIndex] ) smallerIndex = getRightChildIndex(index);
           if(smallerIndex != index) {
               swap(smallerIndex, index);
               index = smallerIndex;
           }else break;

       }
    }

    private void heapifyUp() {
        int index = size - 1;
        while(getParentIndex(index) >=0){
            if(heap[getParentIndex(index)] > heap[index]) {
                swap(getParentIndex(index), index);
                index = getParentIndex(index);
            }else break;
        }
    }

    private void swap(int parentIndex, int index) {
        int val = heap[parentIndex];
        heap[parentIndex] = heap[index];
        heap[index] = val;
    }

    private void printHeap(){
        for (int i =0;i<size;i++) {
            System.out.print(heap[i] + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(4);
        minHeap.insert(10);
        minHeap.insert(3);
        minHeap.insert(5);
        minHeap.insert(1);
        minHeap.printHeap();
        minHeap.peek();
        minHeap.printHeap();
        minHeap.poll();
        minHeap.printHeap();
        minHeap.insert(1);
        minHeap.printHeap();
    }

}
