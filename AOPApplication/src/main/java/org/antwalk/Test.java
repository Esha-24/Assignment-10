package org.antwalk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
//		CustomerService cs=(CustomerService)context.getBean("customerServiceProxy1");
//		System.out.println("------------");
//		cs.getUrl();
//		System.out.println("------------");
//		cs.getName();
//		System.out.println("------------");
//		
//		CustomerService cs1=(CustomerService)context.getBean("customerServiceProxy");
//		System.out.println("------------");
//		cs1.getUrl();
//		System.out.println("------------");
//		cs1.getName();
//		System.out.println("------------");
		
		
		
		Student cs2=(Student)context.getBean("studentProxy");
		System.out.println("\n______Student's ScoreCard________\n");
		cs2.getName();
		cs2.getEngMarks();
		cs2.getHindiMarks();
		cs2.getMathMarks();
	
		Student cs3=(Student)context.getBean("studentProxy1");
		cs3.getTotalMarks();
		cs3.getAvgMarks();
		System.out.println("_____________Thank You_____________");
		
		
	}

}
