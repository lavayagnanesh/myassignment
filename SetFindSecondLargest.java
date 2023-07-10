package july.week3.day2;

import java.util.ArrayList;
import java.util.List;
//import java.awt.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> secndlargest=new TreeSet<Integer>();
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		for (int i = 0; i < data.length; i++) {
			secndlargest.add(data[i]);	//boolean		
		}
	System.out.println(secndlargest);
	List<Integer> largest=new ArrayList<Integer>(secndlargest);
	//largest.add(secndlargest);
	Integer text=largest.get(1);
	System.out.println(text);
	}

}
