package sample;

import org.testng.annotations.Test;

public class sample2 {

	@Test(priority=-1)
	public void createUser() {
		System.out.println("User created!!");
	}
	
	
	@Test(priority =-2)
	
	public void modifyUser() {
		System.out.println("User Modified!!");
	}
	@Test(priority =-3)
	public void deleteUser() {
		System.out.println("User Deleted!!");
	}
}
