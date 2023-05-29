package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int sum;
		
		for(int n=1; n<=11; n++) 
		{
			System.out.println(firstNum);
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
		}
			

	}

}
