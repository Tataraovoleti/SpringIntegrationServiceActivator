import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PollarApp {
	 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		 new ClassPathXmlApplicationContext("delay.xml");
		 
	}
}
