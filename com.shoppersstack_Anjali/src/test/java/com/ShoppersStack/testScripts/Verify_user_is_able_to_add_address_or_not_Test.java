package com.ShoppersStack.testScripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.shoppersstack.GenericUtilities.Base_Test;
import com.shoppersstack.pom.Addressform_Page;
import com.shoppersstack.pom.MyAddress_Page;
import com.shoppersstack.pom.MyProfile_Page;

public class Verify_user_is_able_to_add_address_or_not_Test extends Base_Test
{
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		homepage.getAccountbtn().click();
		homepage.getMyprofilebtn().click();
		
		MyProfile_Page mypropage=new MyProfile_Page(driver);
		mypropage.getMyaddressbtn().click();
		
		Thread.sleep(2000);
		MyAddress_Page myaddress=new MyAddress_Page(driver);
		myaddress.getaddaddressbtn().click();
		
		Addressform_Page addressfrom=new Addressform_Page(driver);
		
		addressfrom.getNameTF().sendKeys(file.readexcelData("Sheet1", 1, 0));
		addressfrom.getHouseTF().sendKeys(file.readexcelData("Sheet1", 1, 1));
		addressfrom.getStreetTF().sendKeys(file.readexcelData("Sheet1", 1, 2));
		addressfrom.getLandmarkTF().sendKeys(file.readexcelData("Sheet1", 1, 3));
		webdriver.selectByValue(addressfrom.getCountryDD(), file.readPropertyData("country"));
		webdriver.selectByValue(addressfrom.getStateDD(), file.readPropertyData("state"));
		webdriver.selectByValue(addressfrom.getCityDD(), file.readPropertyData("city"));
		addressfrom.getPincodeTF().sendKeys(file.readexcelData("Sheet1", 1, 4));
		addressfrom.getPhoneNumberTF().sendKeys(file.readexcelData("Sheet1", 1, 5));
		addressfrom.getAddAddressbtn().click();
		
	}

}
