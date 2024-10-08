package Automation_Task1;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
    public static void main(String[] a) throws IOException {

        //Create a workbook
        XSSFWorkbook wf=new XSSFWorkbook();

        //Create a sheet
        XSSFSheet sheet=wf.createSheet("Sheet1");

        //Create a object to store the given value
        Object data[] [] ={ {"Name","Age","Email"},
                        {"Ranjith",26,"ranjithlevine@gmail.com"},
                        {"Vicky",29,"vignesh@gmail.com"},
                        {"Kumar",32,"Kumaran@gmail.com"} };

          //To get how many rows and column.
            int row=data.length;
            int clm=data[0].length;

            for(int i=0;i<row;i++){
                XSSFRow rows=sheet.createRow(i);
                for(int j=0;j<clm;j++){
                    XSSFCell cell=rows.createCell(j);
                    Object value=data[i][j];

                    if(value instanceof String){
                        cell.setCellValue((String) value) ;
                    }
                    if(value instanceof Integer){
                        cell.setCellValue((Integer) value) ;
                    }
                    if(value instanceof Boolean){
                        cell.setCellValue((Boolean) value) ;
                    }
                }
            }
            String path="src/main/resources/data.xlsx";
        FileOutputStream file=new FileOutputStream(path);
        wf.write(file);

      //  FileInputStream file_read=new FileInputStream(path);
        sheet=wf.getSheetAt(0);

        for(int i=0;i<row;i++){
            XSSFRow rows=sheet.getRow(i);
            for(int j=0;j<clm;j++){
                XSSFCell cell=rows.getCell(j);

                switch (cell.getCellType()){
                    case STRING:System.out.print(cell.getStringCellValue() + "    "); break;
                    case NUMERIC:System.out.print(cell.getNumericCellValue()+ "    "); break;
                }
            }
            System.out.println(" ");
        }





    }
}
