package com.asus.quoter;

import com.asus.quoter.api.service.Quoter;
import com.asus.quoter.config.JavaConfig;
import com.asus.quoter.config.PropertyFileApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.asus.quoter");
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();

    }
}
