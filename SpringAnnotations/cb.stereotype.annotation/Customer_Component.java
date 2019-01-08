package cb.stereotype.annotation;

import org.springframework.stereotype.Component;

import cb.beans.Address;

@Component("myCustomer")
public class Customer_Component {
	private String cust_name;
	private int cust_id;
	private Address cust_address;

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public Address getCust_address() {
		return cust_address;
	}

	public void setCust_address(Address cust_address) {
		this.cust_address = cust_address;
	}

	public Customer_Component() {
		cust_id = 10;
		cust_name = "Nikos";
		cust_address = new Address();
		cust_address.setBuild_no(2);
		cust_address.setCity_name("Rome");
	}
}
