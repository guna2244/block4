package com.jsp.task;

import java.util.Random;

public class Stream {
	public static void main(String[] args) {
		Random random=new Random();
		System.err.println("with sorted");
		random.ints().limit(6).sorted().forEach(System.out::println);
		System.err.println("with out sorted");
		random.ints().limit(6).forEach(System.out::println);
	}

}
