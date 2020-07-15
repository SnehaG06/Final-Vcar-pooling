package com.wpl.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class applicationTesting {

	@Test
	public void test() {
		fail("Invalid");
	}
	@Test
	public void testInvalidEmail()throws NoSuchFieldException {
		emailRegex("sneyahoo.com",false);
	}
	
	@Test
	public void testValidEmail()throws NoSuchFieldException{
		emailRegex("sne@yahoo.com",true);
	}
	@Test
	public void voidtestNoUpperCase()throws NoSuchFieldException{
		emailRegex("Sne@yahoo.com",false);
	}

	private void emailRegex(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

}
