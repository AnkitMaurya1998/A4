package sample;

import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void softAssertStrictComparision() {
		String expectedData="raja";
		String actualData="Raja";
		org.testng.asserts.SoftAssert sa= new org.testng.asserts.SoftAssert();
		sa.assertEquals(actualData,expectedData);
		System.out.println("Strict Comparision passed!!");
		sa.assertAll();
	}
	@Test
	public void containsLevelComparison() {
		String expectedData="raja";
		String actualData="maharaja";
		org.testng.asserts.SoftAssert sa= new org.testng.asserts.SoftAssert(); 
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("contain comparison passed!!");
		sa.assertAll();
	}

}
