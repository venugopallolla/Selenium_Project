package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[8]; 
			obj[0] = temp.getUserName(); 
			obj[1] = temp.getPassword(); 
			obj[2] = temp.getFirstName();
			obj[3] = temp.getFirstName();
			obj[4] = temp.getFirstName();
			obj[5] = temp.getFirstName();
			obj[6] = temp.getFirstName();
			obj[7] = temp.getFirstName();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
			String fileName ="C:\\Users\\IBM_ADMIN\\Test_Data\\TestData.xlsx";
			String sheetname="Sheet1";
			return new ApachePOIExcelRead().getExcelContent(fileName,sheetname); 
	} 
	
	/*
	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1(){
			String fileName ="C:\\Users\\IBM_ADMIN\\Test_Data\\TestData.xlsx";
			String sheetname="Sheet2";
			return new ApachePOIExcelRead().getExcelContent(fileName,sheetname); 
	} 
	*/
	
	
	
	
	/*
	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1(){
		 
		String fileName1 ="C:\\Users\\IBM_ADMIN\\Test_Data\\TestData.xlsx";
		
		return new ApachePOIExcelRead().getExcelContent(fileName1); 
	} 	
	*/
	
	    /*
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}   */
}
