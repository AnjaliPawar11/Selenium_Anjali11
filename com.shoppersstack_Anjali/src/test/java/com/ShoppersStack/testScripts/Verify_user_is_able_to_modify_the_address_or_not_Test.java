package com.ShoppersStack.testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.shoppersstack.GenericUtilities.Base_Test;
import com.shoppersstack.pom.Addressform_Page;
import com.shoppersstack.pom.Editform_Page;
import com.shoppersstack.pom.MyAddress_Page;
import com.shoppersstack.pom.MyProfile_Page;

public class Verify_user_is_able_to_modify_the_address_or_not_Test extends Base_Test
{
	@Test
	public void modifyAddress() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		homepage.getAccountbtn().click();
		homepage.getMyprofilebtn().click();
		
		MyProfile_Page mypropage=new MyProfile_Page(driver);
		mypropage.getMyaddressbtn().click();
		
		MyAddress_Page myaddress=new MyAddress_Page(driver);
		myaddress.getEditbtn().click();
		Thread.sleep(3000);
		
		
		Addressform_Page addressfrom=new Addressform_Page(driver);
		Thread.sleep(3000);
		addressfrom.getNameTF().click();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(3000);
		addressfrom.getNameTF().sendKeys("Anjali Pawar");
		Thread.sleep(3000);
		Editform_Page editpage=new Editform_Page(driver);
		Thread.sleep(1000);
		editpage.getCountrydd().click();
		Thread.sleep(1000);
		editpage.getUsabtn().click();
		Thread.sleep(1000);
		editpage.getStatedd().click();
		Thread.sleep(1000);
		editpage.getCaliforniabtn().click();
		Thread.sleep(1000);
		editpage.getCitydd().click();
		Thread.sleep(1000);
		editpage.getLosAngelesbtn().click();
		Thread.sleep(1000);
		addressfrom.getUpdatebtn().click();
		Thread.sleep(4000);

	}
}
