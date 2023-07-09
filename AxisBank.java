package july.week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit of axis is 2000--->child");

	}

	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();
		axis.saving();
		axis.fixed();
	}
}
