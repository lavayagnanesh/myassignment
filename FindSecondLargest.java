package juneweek2.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		int len=data.length-2;
		Arrays.sort(data);
		System.out.println(data[len]);
		
		
		
	}

}
