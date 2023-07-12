package july.week3.day2;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCharacter {

	public static void main(String[] args) {
		
		String name="Lavanya";
		char[] duplicate=name.toCharArray();
		System.out.println(duplicate);//L,a,v,a,n,y,a
				Set<Character> remove=new LinkedHashSet<Character>();
				for (int i = 0; i < duplicate.length; i++) {
					remove.add(duplicate[i]);
				}
		
		System.out.println(remove);
		
		
	}

}
