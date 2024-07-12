package com.nt.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmatic;

public class AppTest {
	
	@Test
	public void testWithPositives() {
	Arithmatic a=new Arithmatic();
	int expected=30;
	int actual=a.sum(10, 20);
	assertEquals(expected, actual);
}
}
