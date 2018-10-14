import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

public class HelloWorldApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = null;
		
		try {
			
			context = new ClassPathXmlApplicationContext("helloworld.xml", HelloWorldApp.class);
			
			MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);
			PollableChannel outputChannel = context.getBean("printerChannel", PollableChannel.class);
		//	PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);
			
		//	inputChannel.send(new GenericMessage<String>("World"));
			
			inputChannel.send(MessageBuilder.withPayload("Tata ").build());
			
			System.out.println("==> HelloWorldDemo: " + outputChannel.receive(0).getPayload());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			context.close();
		}
	}
}
