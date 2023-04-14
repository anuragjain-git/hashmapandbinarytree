package binarytree;

import java.util.Arrays;

public class binarytree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,30,8,10,16,50,20,60};
		maxheap(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			delete(arr,arr.length-i);
			System.out.println();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void maxheap(int[] arr) {
		int size = arr.length;
		int start=(arr.length/2)-1;
		for(int i=start;i>=0;i--) {
			heapify(arr,size,i);
		}
	}
	public static void delete(int[] arr,int size) {
		int last = arr[size-1];
		arr[size-1]=arr[0];
		arr[0] = last;
		size=size-1;
		heapify(arr,size,0);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void heapify(int[] arr,int size,int i) {
		int max=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<size&&arr[left]>arr[max]) {
			max=left;
		}
		if(right<size&&arr[right]>arr[max]) {
			max=right;
		}
		if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
    		heapify(arr,size,max);
		}
	}
}