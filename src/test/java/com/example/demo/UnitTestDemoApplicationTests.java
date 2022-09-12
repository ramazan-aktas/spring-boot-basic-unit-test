package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

@SpringBootTest
class UnitTestDemoApplicationTests {

	private UnitTestDemoMethods testMethods;

	@BeforeMethod

	public void generateTest(){
		testMethods = new UnitTestDemoMethods();
	}

	@Test
	public void testMethods(){
		Assert.assertEquals(10, testMethods.sum(4,6), "Sum failed.");
		Assert.assertEquals(-2, testMethods.subtract(4,6), "Subtract failed.");
		Assert.assertEquals(24, testMethods.multiply(4,6), "Multiply failed.");
		Assert.assertEquals(0.67, testMethods.divide(4,6), "Divide failed.");
	}

}
