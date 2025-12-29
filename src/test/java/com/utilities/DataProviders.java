package com.utilities;

import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException {
		String path = ".\\testData\\OpencartLoginData.xlsx"; // taking xl file from testdata

		Excelutility xlutil = new Excelutility(path); // creating an object for Excelutility

		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);

		String logindata[][] = new String[totalrows][totalcols]; // created for two dimession array which can stored

		for (int i = 1; i <= totalrows; i++) { // 1 //read the data from xl storing in two dimesional
			for (int j = 0; j < totalcols; j++) { // 0 i is rows j is col
				logindata[i - 1][j] = xlutil.getCellData("Sheet1", i, j); // 1,0
				//System.out.println("i "+(i - 1));
				//System.out.println("j "+j);
				System.out.println(logindata[i - 1][j]);
			}
		}
		return logindata;  //returning two dimensioanal array

	}
	
	//Dataprovider 2
	//Dataprovider 3
	//Dataprovider 4

}
