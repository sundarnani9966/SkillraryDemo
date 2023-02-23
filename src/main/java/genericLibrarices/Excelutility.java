package genericLibrarices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	private Workbook wb;
	public void excelInitilization(String excelpath) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			wb=WorkbookFactory.create(fis);
		} catch ( EncryptedDocumentException | IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	public String fetchDataFromExcel(String SheetName, int rowNum,int cellNum) {
	return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	public List<String> fetchDataFromExcel(String SheetName){
	List<String> dataList=new ArrayList<>();
	Sheet sheet=wb.getSheet(SheetName);
	for(int i=0; i<=sheet.getLastRowNum();i++) {
		String data=sheet.getRow(i).getCell(1).getStringCellValue();
		dataList.add(data);
	}
	return dataList;
	}
	public void closeExcel() {
		try {
			wb.close();
		} catch ( IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
