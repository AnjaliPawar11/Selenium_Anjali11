package com.shoppersstack.GenericUtilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class java_Utility 
{
	public int generateRandomNumber()
	{
		Random rm=new Random();
		int value=rm.nextInt(1000);
		return value;
	}
	
	public String localdate()
	{
		return LocalDate.now().toString().replace("-", "");
	}
	
	public String localdatetime()
	{
		return LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
	}

}
