package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/* Name: ExcelLib
 * Description: This class is responsible for fetching the data from excel sheet
 * Developed By: Deepa
 * Reviewwd By:Shantosh
 */





public class ExcelLib {

	XSSFWorkbook wb;
	
	 public ExcelLib(String excelpath) 
	
	{
		try
		{
			 File src = new File(excelpath);
            FileInputStream fis = new FileInputStream(src);
             wb = new XSSFWorkbook(fis);
               
		}
		catch(Exception e)
		{
			System.out.println("unable to load the excel file" + e.getMessage());
		}
		
		}

        public int getRowcount(int sheetnum) 
        {
       	 int count = wb.getSheetAt(sheetnum).getLastRowNum()+1;
       	 return count;
        }
       
        public int getRowcount(String sheetname) 
        {
       	 int count = wb.getSheet(sheetname).getLastRowNum()+1;
       	 return count;
        }
        
        public String getCellData(int sheetnum,int row,int col)
        {
       	 String data = wb.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
       	 return data;
       	 
        }
        
        public String getCellData(String sheetname,int row,int col)
        {
       	 String data = wb.getSheet(sheetname).getRow(row).getCell(col).toString();
       	 return data;
       	 
        }
        

}
