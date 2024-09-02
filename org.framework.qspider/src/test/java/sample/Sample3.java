package sample;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(priority =1,invocationCount=3)
	public void createUser() {
		System.out.println("User created!!");
	}
	
	//@Test(enabled = false)
	@Test(priority =2,dependsOnMethods = {"createUser"})
	
	public void modifyUser() {
		System.out.println("User Modified!!");
	}
	
	@Test(priority=3)
	public void deleteUser() {
		System.out.println("User Deleted!!");
	}
}
