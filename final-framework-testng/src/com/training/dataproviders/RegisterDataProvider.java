package com.training.dataproviders;

import org.testng.annotations.DataProvider;

import com.training.readexcel.ApachePOIExcelRead;

public class RegisterDataProvider {
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
			String fileName ="C:\\Users\\IBM_ADMIN\\Test_Data\\TestData.xlsx";
			String sheetname="Sheet3";
			return new ApachePOIExcelRead().getExcelContent(fileName,sheetname); 
	}

}
