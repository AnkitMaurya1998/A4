package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void hardAssertStrictComparision() {
		String expectedData="raja";
		String actualData="Raja";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("Strict comparision pass!!");
				
	}
	@Test
	public void ContainsLevelComparision() {
		String expectedData="raja";
		String actualData="maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contain comparison passed!!");
	}
}
