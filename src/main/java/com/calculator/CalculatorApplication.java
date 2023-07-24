package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(CalculatorApplication.class, args);

		System.out.println(Calculator.add(2,3));
		System.out.println(Calculator.subtract(2,3));
		System.out.println(Calculator.multiply(2,3));
		System.out.println(Calculator.divide(10,2));
		System.out.println(Calculator.divide(2,0));
	}

}
