package quicksort;

import java.util.*;

class quickSort 
{ 
       int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        {  
            if (arr[j] <= pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        System.out.println();
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        printArray(arr); 
        return i+1; 
    } 
  
  
        void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is pivot index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
    /* A function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // main program 
    public static void main(String args[]) 
    { 
        int arr[] = {5,2,6,1,3,4,7}; 
        int n = arr.length; 
  
        quickSort ob = new quickSort(); 
        ob.sort(arr, 0, n-1); 
        System.out.println("\n");
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
