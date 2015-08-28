package propertyreader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PropertyReaderMain {
	
	@Autowired
	PropertyPlaceHolderBean propertyPlaceHolderBean; 

	public static final void main(final String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-ctx.xml");
		
		PropertyPlaceHolderBean propertyPlaceHolderBean = (PropertyPlaceHolderBean)ctx.getBean("propertyPlaceHolderBean");
		
		System.out.println(propertyPlaceHolderBean.toString());
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
