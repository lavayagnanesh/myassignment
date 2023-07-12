package july.week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str="Testleaf";
		char[] ch=str.toCharArray();
		System.out.println(ch);
		for (int i = ch.length-1; i >= 0; i--) //if we give only ch.length, then it will throw an error,because length not starts from 0
		{
			System.out.print(ch[i]);//if we give only i, the length will be written as o/p-->76543210
		}

	}

}
