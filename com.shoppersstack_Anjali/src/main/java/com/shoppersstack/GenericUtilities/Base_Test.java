package com.shoppersstack.GenericUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shoppersstack.pom.Home_Page;
import com.shoppersstack.pom.Login_Page;
import com.shoppersstack.pom.Welcome_Page;

public class Base_Test 
{
	public WebDriver driver;
	static WebDriver listenersDriver;
	public java_Utility ju=new java_Utility();
	public File_utility file=new File_utility();
	public webDriver_utility webdriver=new webDriver_utility();
	public Welcome_Page welcomepage;
	public Login_Page loginpage;
	public Home_Page homepage;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public  void beforetest()
	{
		System.out.println("BeforeTest");
		spark=new ExtentSparkReporter("./reports/"+ju.localdatetime()+".html");
		report=new ExtentReports();
		report.attachReporter(spark);
		test=report.createTest("Demo");
		
	}
	@BeforeClass
	public void beforeclass() throws IOException
	{
		String browser=file.readPropertyData("browser");
		String url=file.readPropertyData("url");
		
		//String browser=System.getProperty("browser");
		//String url=System.getProperty("url");
		
		if(browser.contains("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.contains("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.contains("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid browser name");
		}
		listenersDriver=driver;
		welcomepage=new Welcome_Page(driver);
		loginpage= new Login_Page(driver);
		homepage=new Home_Page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
		
	}
	@BeforeMethod
	public void beforemethod() throws IOException, InterruptedException
	{
		System.out.println("BeforeMethod");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		Thread.sleep(3000);
		welcomepage.getLoginbtn().click();
		loginpage.getEmailTF().sendKeys(file.readPropertyData("username"));
		loginpage.getPasswordTF().sendKeys(file.readPropertyData("password"));
		loginpage.getLoginbtn().click();
	}
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		System.out.println("AfterMethod");
		Thread.sleep(4000);
		homepage.getAccountbtn().click();
		Thread.sleep(4000);
		homepage.getLogoutbtn().click();
	}
	@AfterClass
	public void afterclass() throws InterruptedException
	{
		System.out.println("AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("AfterTest");
		report.flush();
		
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("AfterSuite");
	}
}
