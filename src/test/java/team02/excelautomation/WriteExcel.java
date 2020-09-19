package team02.excelautomation;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    @Test
    public void test() throws IOException {
        String dosyaYolu=".\\src\\test\\resources\\SINIF.xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        FileOutputStream fileOutputStream =new FileOutputStream(dosyaYolu);
        workbook.getSheetAt(0).getRow(0).createCell(4).setCellValue("YAS");
        workbook.getSheetAt(0).getRow(1).createCell(4).setCellValue("23");
        workbook.getSheetAt(0).getRow(2).createCell(4).setCellValue("25");
        workbook.getSheetAt(0).getRow(3).createCell(4).setCellValue("27");
        workbook.getSheetAt(0).getRow(4).createCell(4).setCellValue("29");
        workbook.getSheetAt(0).getRow(5).createCell(4).setCellValue("33");
        workbook.getSheetAt(0).getRow(6).createCell(4).setCellValue("45");
        workbook.getSheetAt(0).getRow(7).createCell(4).setCellValue("63");


        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }
}
