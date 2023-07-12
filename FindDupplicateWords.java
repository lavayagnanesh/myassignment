package july.week3.day2;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDupplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		//
		String Split[]=text.split("\\s");
		System.out.println(Split.length);
		Set<String> dup=new LinkedHashSet<String>();
		for (int i =0;i<Split.length; i++) {
			dup.add(Split[i]);
		}
		
	System.out.print(dup);
	
	}

}
