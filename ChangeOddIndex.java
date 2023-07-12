package july.week3.day2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			if (i%2!=0) 
			{
				char upperCase = Character.toUpperCase(charArray[i]);	
				System.out.println("odd charcters are:" +upperCase);
			}
			else {
				System.out.println("Even Characters are:" +charArray[i]);
			}
		}
			
		}

	}


