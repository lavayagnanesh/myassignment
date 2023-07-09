package july.week3.day1;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("desktopSize is big---->child");

	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.desktopSize();
		desk.computerModel();
	}

	
	
}
