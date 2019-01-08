import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.*;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		EngStudent student_old = (EngStudent) context.getBean("eng_old");

		System.out.println(student_old.getName() + "\t" + student_old.getRollNo() 
				+ "\t" + student_old.getCollege_code());

		/*EngStudent student_new = (EngStudent) context.getBean("eng_new");
		System.out.println("with new configuration");
		System.out
				.println(student_new.getName() + "\t" + student_new.getRollNo()
				+ "\t" + student_new.getCollege_code());

		System.out.println("with new configuration with overridding roll number");
		EngStudent student_new1 = (EngStudent) context.getBean("eng_new1");
		System.out.println(
				student_new1.getName() + "\t" + student_new1.getRollNo() + "\t" 
				+ student_new1.getCollege_code());

		System.out.println("obtaining Student instance");
		Student student = (Student) context.getBean("student");*/
	}
}
