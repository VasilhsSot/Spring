import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Car;

public class TestCar {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// first request to get the car instance
		Car car_one = (Car) context.getBean("car");
		car_one.setColor("blue");
		car_one.show();

		// second request to get the car instance
		Car car_two = (Car) context.getBean("car");
		car_two.show();
	}
}
