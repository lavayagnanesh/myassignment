package juneweek1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 13;
		int count=0;
		
	//check if number is >1
		if(a>1)
		{//check if the number is divisible by 1 and itself
			for (int j=1;j<=13;j++)//declaring j to divide a value
			{
			if(a%j==0)//
			count++;
			}
			if(count==2)
			{
				 System.out.println("The given number is prime") ;
			}
			else
			{
				System.out.println("The numbert is not prime number");
			}
		}
		else
		{
			System.out.println("The number is not prime number");
		}

	}

}
