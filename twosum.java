package Sorting;
import java.util.*;

public class twosum {
	public static boolean twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) 
	            return true;
	    }
		return false;
	}

public static void main(String args[]) {
	int a[]= {3,5,7,9,4};
	System.out.println(""+twoSum(a,5));
}
}