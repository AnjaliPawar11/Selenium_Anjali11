package com.shoppersstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addressform_Page 
{
		public Addressform_Page(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);	
			
		}
		@FindBy(id="Name")
		private WebElement nameTF;
	
		@FindBy(id="House/Office Info")
		private WebElement HouseTF;

		@FindBy(id="Street Info")
		private WebElement StreetTF;

		@FindBy(id="Landmark")
		private WebElement LandmarkTF;
		
		@FindBy(id="Country")
		private WebElement CountryDD;

		@FindBy(id="State")
		private WebElement StateDD;

		@FindBy(id="City")
		private WebElement CityDD;

		@FindBy(id="Pincode")
		private WebElement PincodeTF;

		@FindBy(id="Phone Number")
		private WebElement PhoneNumberTF;

		@FindBy(id="addAddress")
		private WebElement addAddressbtn;
		
		@FindBy(id="Update Address")
		private WebElement updatebtn;
		
		public WebElement getNameTF() 
		{
			return nameTF;
		}

		public WebElement getHouseTF() 
		{
			return HouseTF;
		}

		public WebElement getStreetTF() 
		{
			return StreetTF;
		}

		public WebElement getLandmarkTF() 
		{
			return LandmarkTF;
		}

		public WebElement getCountryDD() {
			return CountryDD;
		}

		public WebElement getStateDD() 
		{
			return StateDD;
		}
		public WebElement getCityDD() 
		{
			return CityDD;
		}
		public WebElement getPincodeTF() 
		{
			return PincodeTF;
		}
		public WebElement getPhoneNumberTF() 
		{
			return PhoneNumberTF;
		} 
		public WebElement getAddAddressbtn() 
		{
			return addAddressbtn;
		}

		public WebElement getUpdatebtn() {
			return updatebtn;
		}
		
	}

