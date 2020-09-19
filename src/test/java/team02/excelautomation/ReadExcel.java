package team02.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    //Excel   == Workbook
    //Sayfa   == Sheet
    //Satır   == Row
    //Hücre   == Cell
    @Test
    public void excelTest() throws IOException {
        String dosyaYolu=".\\src\\test\\resources\\SINIF.xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);
        int satirSayisi = workbook.getSheetAt(0).getLastRowNum();
        int sutunSayisi = workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println(workbook.getSheetAt(0).getRow(1).getCell(1));
        System.out.println(workbook.getSheetAt(0).getRow(5).getCell(2));

        System.out.println("Satir sayisi: " + satirSayisi);
        int doluSatir =workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu satir sayisi: " + doluSatir);

        for (int i = 0; i<satirSayisi; i++){

            for (int j =0; j<sutunSayisi; j++){

                System.out.print(workbook.getSheetAt(0).getRow(i).getCell(j)+"***");

            }
        }
        System.out.println("////////////////////////////");
        for (int k = 0; k< satirSayisi; k++){
            System.out.println(workbook.getSheetAt(0).getRow(k).getCell(0));

        }
        System.out.println("//////////////////////////////");
        for (int l=0; l<satirSayisi; l++){
            System.out.println(workbook.getSheetAt(0).getRow(l).getCell(1));
        }
        int sonSutunIndex =workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println("Son sutun indexi: " + sonSutunIndex);
        for (int s=0; s<sonSutunIndex; s++){
           System.out.println("5. satir "+ s + ". sutun :" +workbook.getSheetAt(0).getRow(5).getCell(s));
        }

    }
}
