import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.stereotype.annotation.Customer_Component;


public class TestCustomer_component {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		Customer_Component customer = (Customer_Component) context.getBean("myCustomer");
		System.out.println(customer.getCust_name() + "\t" + customer.getCust_id() + 
				customer.getCust_address());
	}
}
