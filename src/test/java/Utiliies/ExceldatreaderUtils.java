package Utiliies;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExceldatreaderUtils {
	@DataProvider
	public String[][] getdata() throws IOException {
		File files = new File("C:\\Users\\user\\Downloads\\data of orangehrmexcel.xlsx");
		FileInputStream fls = new FileInputStream(files);
			XSSFWorkbook excel = new XSSFWorkbook(fls);
			XSSFSheet sheet = excel.getSheet("Sheet1");
			int getrownum = sheet.getPhysicalNumberOfRows();
			int getcolnm = sheet.getRow(0).getLastCellNum();
			String[][] values= new String[getrownum-1][getcolnm];
			for(int i=0; i<getrownum-1;i++) {
				for(int j=0;j<getcolnm;j++) {
					DataFormatter df = new DataFormatter();
					values[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
					System.out.println(values[i][j]);
				}
			}
			return values;
			}
}
