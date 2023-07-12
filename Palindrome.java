package july.week3.day2;

//import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Palindrome {
	public static void main(String[] args) {
	String name="colour";
	char[] character=name.toCharArray();
	System.out.println(character);
	String rev="";
	for (int i =character.length-1; i >=0 ; i--)
	{
		System.out.println(character[i]);
	if (name.equals(character[i])) 
	{
		System.out.println("colour is palindrome");
	}
	
	else {
		
	}
	
	}
	
	System.out.println("colour is not palindrome");
}}
