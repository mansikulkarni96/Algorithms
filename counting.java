package algo;

public class counting {
	void countingSort(int arr[]) 
    { 
        int index=0;
        int[] freq_arr;
        freq_arr = new int[] {0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<arr.length;i++)
        {
        	int val=arr[i];
        	freq_arr[val-1]=freq_arr[val-1]+1;
        	
        }
        for(int j=0;j<freq_arr.length;j++)
        	for(int k=0 ; k < freq_arr[j]; k++)

        			{

        			arr[index++]=j+1;

        			}
}

public static void main(String[] args)  
{ 
    counting op = new counting(); 
    int arr[] = {1, 6, 3, 1, 3, 4, 6}; 
    op.countingSort(arr); 
    for (int i=0; i < arr.length; i++)  {
        System.out.println("sorted array"+arr[i]);

    }
}
}