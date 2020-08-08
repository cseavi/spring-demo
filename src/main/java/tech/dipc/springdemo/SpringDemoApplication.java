package tech.dipc.springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanConfiguration.xml");


		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");

		helloWorld.printHello();
	}

    /*public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}*/

}
