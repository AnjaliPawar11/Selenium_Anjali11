package com.shoppersstack.GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_utility 
{
	FileInputStream fis;
	public String readPropertyData(String key) throws IOException
	{
		fis=new FileInputStream(framework_constant.propertyPath);
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;	
	}
	public String readexcelData(String sheetname,int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		fis=new FileInputStream(framework_constant.excelPath);
		Workbook wo=WorkbookFactory.create(fis);
		String value=wo.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
	}
}
