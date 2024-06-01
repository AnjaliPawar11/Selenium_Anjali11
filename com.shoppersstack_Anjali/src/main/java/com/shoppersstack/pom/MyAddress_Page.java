package com.shoppersstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page 
{
	public MyAddress_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addaddressbtn;
	public WebElement getaddaddressbtn() {
		return addaddressbtn;
	}
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement deletebtn;
	
	
	public WebElement getDeletebtn() {
		return deletebtn;
	}
	@FindBy(xpath="(//button[text()='Yes'])[1]")
	private WebElement yesbtn;
	public WebElement getYesbtn() {
		return yesbtn;
	}
	@FindBy(xpath="(//button[contains(@class,'MuiButtonBase-root')])[3]")
	private WebElement editbtn;
	
	public WebElement getEditbtn() {
		return editbtn;
	}
	
	
	
}
