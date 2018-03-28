package ICS4U;

import java.util.Scanner;

public class Sort {

	static Scanner scan = new Scanner(System.in);


	private static void swap( int[] a, int first, int second) {

		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;

	}

	private static void swap(double[] a, int first, int second) {

		double temp = a[first];
		a[first] = a[second];
		a[second] = temp;

	}

	private static void swap(String[] a, int first, int second) {

		String temp = a[first];
		a[first] = a[second];
		a[second] = temp;

	}

	public static void selectionSort(int[] a) {
		for(int i=0; i<a.length; i++) {
			int min=i;

			for(int j=i+1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}

	public static void selectionSort(double[] a) {
		for(int i=0; i<a.length; i++) {
			int min=i;

			for(int j=i+1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}

	public static void insertionSort(int[] a) {

		for(int i = 1; i< a.length; i++) {
			int j = i;
			while (j > 0 && a[j]<a[j-1]) {
				swap(a, j, j-1);
				j--;
			}
		}
	}

	public static void insertionSort(double[] a) {

		for(int i = 1; i< a.length; i++) {
			int j = i;
			while (j > 0 && a[j]<a[j-1]) {
				swap(a, j, j-1);
				j--;
			}
		}
	}

	public static void bubbleSort(int[] a) {

		for(int i = a.length-1; i>= 0; i--) {
			int j = i;
			while (j < a.length-1 && a[j]>a[j+1]) {
				swap(a, j, j+1);
				j++;
			}
		}
	}

	public static void bubbleSort(double[] a) {

		for(int i = a.length-1; i>= 0; i--) {
			int j = i;
			while (j < a.length-1 && a[j]>a[j+1]) {
				swap(a, j, j+1);
				j++;
			}
		}
	}

	public static void quickSort (int[] a) {
		
	}

	public static void quickSort (double[] a) {
		
	}

	public static void main(String[] args) {

		System.out.println("please enter the length of the array:");
		int[] a = new int[scan.nextInt()];

		System.out.println("Enter the numbers:");
		for(int i=0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		bubbleSort(a);

		for(int i=0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
