package Sorting;

import java.util.*;

public class MergeSort {

	public static void merge(int data[], int left, int right, int middle) {
		
		
		int first_data = middle - left + 1;
		
		int second_data = right - middle;

		int a = 0, b = 0, c = left;
		
		//two temporary arrays 
		int Left[] = new int[first_data];
		int Right[] = new int[second_data];

 
		for (int x = 0; x < first_data; x++) {
			Left[x] = data[left + x];
		}
		
		for (int y = 0; y < second_data; y++) {
			Right[y] = data[middle + 1 + y];
		}

		while (a < first_data && b < second_data) {
			if (Left[a] < Right[b]) {
				data[c] = Left[a];
				a++;
				c++;
			} else {
				data[c] = Right[b];
				b++;
				c++;
			}
		}

		//Left array
		while (a < first_data) {
			data[c] = Left[a];
			a++;
			c++;
		}

		//right array
		while (b < second_data) {
			data[c] = Right[b];
			b++;
			c++;
		}
	}

	public static void mergeSort(int data[], int start, int end) {
		System.out.println("start: "+ start+ " end: "+ end);
		if (start < end) {
			int middle = (end + start) / 2;
			mergeSort(data, start, middle);
			mergeSort(data, middle + 1, end);
			merge(data, start, end, middle);
		}
	}

	public static void iterarive_mergeSort(int data[], int start, int end) {
		int i = 2, j = 0;
		while (i < data.length) {
			j = 0;
			while (j < data.length - 1) {
				int right = (j + i) - 1;
				int left = j;
				if (right > data.length) {
					right = data.length - 1;
				}
				int middle = (left + right) / 2;
				merge(data, left, right, middle);
				j = j + i;
			}
			i = i * 2;
			if (i >= data.length) {
				i = i / 2;
				merge(data, 0, data.length - 1, (i - 1));
				i = data.length;
			}
		}
	}

	public static void main(String[] args) {
		int data[] = {15,20,5,1,36,23,4,10,8};
		int data1[] = {15,20,5,1,36,23,4,10,8};
		for (int i = 0; i < 9; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		mergeSort(data, 0, data.length - 1);
		for (int i = 0; i < 9; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		iterative_mergeSort(data1, 0, data1.length);
		for (int i = 0; i < 9; i++) {
			System.out.print(data1[i] + " ");
		}
	}
}