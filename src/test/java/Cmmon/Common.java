package Cmmon;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Common {
	  public static int getRowCount (String x, String y)

      {

          try

               {

        	//  File f=new File(x);
      	FileInputStream fi=new FileInputStream(x);
      		XSSFWorkbook wb=new XSSFWorkbook(fi); 

                   return wb.getSheet(y).getLastRowNum();

                      }

                      catch (Exception e)

                      {

                        return 0;

                      }
      }
	  public static String getCellValue(String x, String y, int r, int c)

	    {
	        try

	              {

	        	// File f=new File(xl);
	           	FileInputStream fi=new FileInputStream(x);
	           		XSSFWorkbook wb=new XSSFWorkbook(fi); 

	                           XSSFCell cell =wb.getSheet(y).getRow(r).getCell(c);
	                 if(cell.getCellType()==CellType.STRING)
	                 {
	                            return cell.getStringCellValue();

	                              
	                 }
	                 else
	                 {
	                
	                	 return cell.getRawValue();
	                	
	                 }
	              }
	                              catch (Exception e)

	                              {

	                                              return "";

	                              }

	              }

}
