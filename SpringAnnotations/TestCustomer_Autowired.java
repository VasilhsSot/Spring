import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.autowiring.annotation.Customer_Autowired;

public class TestCustomer_Autowired {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("customer_new.xml");
		Customer_Autowired customer = (Customer_Autowired) context.getBean("customer_Autowired");
		System.out.println(customer.getCust_name() + "\t" + customer.getCust_id() + 
				"\t" + customer.getCust_address());

	}

}
