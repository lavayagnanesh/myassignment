package july.week3.day1;

public class BankInfo {
//saving(),fixed(),deposit()
	public void saving() {
		System.out.println("saving can be 100000--->parent");

	}
	public void fixed() {
		System.out.println("fixed deposit amount is 15000--->parent");

	}
	public void deposit() {
		
System.out.println("deposit can be greater tna 1000--->parent");
	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.deposit();
		bank.saving();
		bank.fixed();
	}
	
	
	
}
