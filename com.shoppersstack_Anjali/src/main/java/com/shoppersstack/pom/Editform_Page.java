package com.shoppersstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editform_Page 
{

	public Editform_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[text()='Country']/../div")
	private WebElement countrydd;
	
	@FindBy(xpath="//li[text()='USA']")
	private WebElement usabtn;
	
	@FindBy(xpath="//label[text()='State']/../div")
	private WebElement statedd;
	
	@FindBy(xpath="//li[text()='California']")
	private WebElement californiabtn;
	
	@FindBy(xpath="//label[text()='City']/../div")
	private WebElement citydd;
	
	@FindBy(xpath="//li[text()='Los Angeles']")
	private WebElement losAngelesbtn;

	public WebElement getCountrydd() {
		return countrydd;
	}

	public WebElement getStatedd() {
		return statedd;
	}

	public WebElement getCitydd() {
		return citydd;
	}

	public WebElement getUsabtn() {
		return usabtn;
	}

	public WebElement getCaliforniabtn() {
		return californiabtn;
	}

	public WebElement getLosAngelesbtn() {
		return losAngelesbtn;
	}
	
	
}
