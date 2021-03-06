import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thomas.service.CustomerService;

public class Application {

	public static void main(String[] args) {

//		CustomerService customerService = new CustomerServiceImpl();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println("customerService1 :: " + customerService);
		
		CustomerService customerService2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println("customerService2 :: " + customerService2);
		
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
