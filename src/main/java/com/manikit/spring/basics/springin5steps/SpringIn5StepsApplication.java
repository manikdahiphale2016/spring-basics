package com.manikit.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
	//	BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
	// ApplicationContext of Spring framework maintain the beans..
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {12,3,4}, 3);
		System.out.println(result);
	}

}
