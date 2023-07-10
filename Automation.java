package july.week3.day1;

public class Automation extends MultipleLanguage {
	public void Selenium() {

System.out.println("Selenium is -->son interface");
	}

	public void Java() {
		System.out.println("Java is -->parent interface");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby is -->abstract class");
	}	
		public void test()
		{
			System.out.println("test is -->to understand execution of execution class");
		}
		@Override
		public void python() {
			System.out.println("python is -->abstract class");
		}	
	
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Selenium();
		auto.Java();
		auto.test();
		auto.ruby();
		auto.python();

	}

	
	
	
	
}
