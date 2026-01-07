import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.service.UserService;

public class MyApp {

	public static void main(String[] args) {

		// Starting IOC Container
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);

		// get bean obj from ioc
		UserService bean = ctxt.getBean(UserService.class);

		// call bean method
		bean.printName();
                 int i=0;

                 int j=12;

                 

	        String name ="ashokit";
                int k=30;

              String name ="ashokit";
              boolean status= false;
                



	}
}
