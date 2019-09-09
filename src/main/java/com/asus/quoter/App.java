package com.asus.quoter;

import com.asus.quoter.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    }
}
