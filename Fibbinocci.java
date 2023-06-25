package juneweek1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 0;
		int secondNum = 1;
		int sum=0;
		
		for( int i =0; i<=12;i++)
		{	
			System.out.println(firstNum);
			sum= firstNum+secondNum ;
			firstNum=secondNum;
			secondNum=sum;	
			
		}		

	}
}
