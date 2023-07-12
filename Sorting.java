package july.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		String[] nums= {"Google","Microsoft","TestLeaf","Maverick"};
		List<String> numbers=new ArrayList<String>();
		for (int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		}
		
		Collections.sort(numbers);
		System.out.println();
	}

}


