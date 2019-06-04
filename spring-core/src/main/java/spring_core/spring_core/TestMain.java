
package spring_core.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	
	public static void main(String[] args) {
		
	   ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	   Abcus ab =(Abcus) context.getBean("ab");
	   ab.calcSum(10, 20);
	   
	}
}
 