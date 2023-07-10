package july.week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class SetMissingNumber {

	//private static boolean add;

	//private static boolean boolean add;

	public static void main(String[] args) {
		int[] nums= {1,2,3,5,6,7,8,9};
		
		Set<Integer> missing=new TreeSet<Integer>();
		//Set<Integer> numbers=new TreeSet<Integer>();
		for (int i = 1; i < nums.length; i++) {
		if (i+1!=nums[i]) 
		{
			missing.add(i+1);
			break;
		}	
		
	}//if boolean is false, it comes to if
		
		System.out.println(missing);
	
	}

}
