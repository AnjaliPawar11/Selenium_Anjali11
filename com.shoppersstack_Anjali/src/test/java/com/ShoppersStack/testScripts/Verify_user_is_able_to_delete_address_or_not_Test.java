package com.ShoppersStack.testScripts;

import org.testng.annotations.Test;
import com.shoppersstack.GenericUtilities.Base_Test;
import com.shoppersstack.pom.MyAddress_Page;
import com.shoppersstack.pom.MyProfile_Page;

public class Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test
{
	@Test
	public void deleteAddress() throws InterruptedException
	{
		homepage.getAccountbtn().click();
		homepage.getMyprofilebtn().click();
		
		MyProfile_Page mypro= new MyProfile_Page(driver);
		mypro.getMyaddressbtn().click();
		
		MyAddress_Page address=new MyAddress_Page(driver);
		Thread.sleep(2000);
		address.getDeletebtn().click();
		Thread.sleep(2000);
		address.getYesbtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}

}
