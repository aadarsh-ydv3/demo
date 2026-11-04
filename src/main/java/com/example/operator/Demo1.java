package com.example.operator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1 {

	public static void main(String[] args) {

		byte b =5;
		short s = 10;
		int i = 1000;
		long l= 10000;

		System.out.println("Integer Value -->" + b+ "," +s+ "," +i +","+l);
	}

}
