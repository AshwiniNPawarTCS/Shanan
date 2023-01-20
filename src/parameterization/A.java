package parameterization;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
	public static void main(String[] args) throws Throwable{
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Downloads\\Book1.xlsx"); 
	 String data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	}

}
 