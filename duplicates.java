package Sorting;

public class duplicates {
	 public static void removeDuplicates(int[] nums) {
	        int index=0;
	        int b[] = new int[10];
	        for(int i=0;i<nums.length-1;i++)
	        {
	            if(nums[i]==nums[i+1])
	            	continue;
            	b[index++]=nums[i];
	           
	        }
	        b[index++] = nums[nums.length-1];    

			for(int i=0;i<index;i++) {
				System.out.println(b[i]);
			}
	    }
	
	 
	 public static void main(String args[]) {
			int a[]= {3,5,5,7,9};
			removeDuplicates(a);	
		}
	 
	 


}
