import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tata.springintegration.serviceact.HelloWorldService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:helloworld.xml")
public class SpringAppTests {

    @Autowired
    private HelloWorldService helloService;
  

    @Test
    public void testSayHello() {
        assertEquals("Hello test", helloService.sayHello("test"));
    }
}