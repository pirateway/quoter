package com.asus.quoter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.asus.quoter");

    }
}
