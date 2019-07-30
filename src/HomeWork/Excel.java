package HomeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void read(String fileName) throws IOException {
		File fi = new File(fileName);
		FileInputStream is = new FileInputStream(fi);
		XSSFWorkbook wb = new XSSFWorkbook(is);
		XSSFSheet sheet = wb.getSheetAt(0);
		Iterator itRow = sheet.rowIterator();
	
		while(itRow.hasNext()) {
			XSSFRow row = (XSSFRow) itRow.next();
			Iterator itCell = row.cellIterator();
			System.out.println("============");
			while(itCell.hasNext()){
				XSSFCell cell = (XSSFCell) itCell.next();
				System.out.print(cell + " ");
			}
			System.out.println(" ");
			}
	}
	public static void write(String fileName, List<String[]> dataList) throws IOException {
		FileOutputStream fis = new FileOutputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("123");
		XSSFRow title = sheet.createRow(0);
		XSSFCell cell1 = title.createCell(1);
		cell1.setCellValue(" ");
		XSSFCell cell2 = title.createCell(2);
		cell2.setCellValue("LEVE");
		XSSFCell cell3 = title.createCell(3);
		cell3.setCellValue("PW");
	
	
		for(int i=0 ; i<dataList.size();i++) {
			XSSFRow row = sheet.createRow(i+1);
			
			String[] rowData = dataList.get(i);
			
			for(int j=0;j<rowData.length;j++) {
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(rowData[j]);
				
			}
		}
		
//		FileOutputStream fis = new FileOutputStream(fileName);
		wb.write(fis);
		fis.flush();
		fis.close();
		
		
		
	}

}
