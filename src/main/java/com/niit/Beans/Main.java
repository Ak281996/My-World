package com.niit.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Main {
public static void main(String arg[])
{
	ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
	HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
	System.out.println(helloWorld.sayHello());
	HelloWorld helloWorld1=(HelloWorld)context.getBean("helloWorld");
System.out.println(helloWorld1.sayHello());	
}
}
