package test_cases;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

      
            FileInputStream fis = new FileInputStream("Files/dataFiles/testdata1.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet dataExampleSheet = workbook.getSheet("dataExample");
    
            Row row = dataExampleSheet.getRow(0);
            Cell cell = row.getCell(0);
            System.out.println(dataExampleSheet.getRow(0).getCell(0));
            
//            System.out.println(dataExampleSheet.getSheetName());
//            workbook.close();
//            fis.close();
     

    }

    public static void getExcelData() throws IOException{
         //Get firts cell data from Excel sheet
         FileInputStream file = new FileInputStream("Files/dataFiles/testdata1.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheet("Sheet1");
         String firstCellData = sheet.getRow(0).getCell(0).getStringCellValue();
         System.out.println(firstCellData);
         
         //Get second cell data from Excel sheet
         String secondCellData = sheet.getRow(1).getCell(0).getStringCellValue();
         System.out.println(secondCellData);
         
         //Get third cell data from Excel sheet
         String thirdCellData = sheet.getRow(2).getCell(0).getStringCellValue();
         System.out.println(thirdCellData);
         
         //Get fourth cell data from Excel sheet
         String fourthCellData = sheet.getRow(3).getCell(0).getStringCellValue();
         System.out.println(fourthCellData);
         
         //Get fifth cell data from Excel sheet
         String fifthCellData = sheet.getRow(4).getCell(0).getStringCellValue();
         System.out.println(fifthCellData);
         
         //Get sixth cell data from Excel sheet
         String sixthCellData = sheet.getRow(5).getCell(0).getStringCellValue();
         System.out.println(sixthCellData);
         
         //Get seventh cell data from Excel sheet
         String seventhCellData = sheet.getRow(6).getCell(0).getStringCellValue();
         System.out.println(seventhCellData);
         
         //Get eighth cell data from Excel sheet
         String eighthCellData = sheet.getRow(7).getCell(0).getStringCellValue();
         System.out.println(eighthCellData);
         
         //Get ninth cell data from Excel sheet
         String ninthCellData = sheet.getRow(8).getCell(0).getStringCellValue();
         System.out.println(ninthCellData);
         
         workbook.close();
    }

    
}
