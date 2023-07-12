package july.week3.day2;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="PayPal India";
		String replaceall=str.replaceAll(" ", "");
		System.out.println(replaceall);
		char[] remove=replaceall.toCharArray();
		for (int i = 0; i < remove.length; i++) {
			//System.out.println(remove[i]);
		}
		
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		for (int i = 0; i < remove.length; i++) {
			boolean add = charSet.add(remove[i]);
		
		if (!add) {
			dupCharSet.add(remove[i]);
			continue;
		} 
		//
		
		
		else {
			charSet.add(remove[i]);
			//
		}}
		System.out.println(dupCharSet);
		System.out.println(charSet);
		}
	

}
