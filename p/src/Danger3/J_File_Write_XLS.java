package Danger3;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class J_File_Write_XLS 
{
public static void main(String[] args) throws IOException, RowsExceededException, WriteException
{
	File f=new File("../p/Test_Data/Write_Xls.xls");
	WritableWorkbook wk=Workbook.createWorkbook(f);
	WritableSheet ws=wk.createSheet("Sanjeev",1 );
	for(int i=0 ;i<10 ;i++)
	{
		for(int j=0 ;j<10 ;j++)
		{
			Label L=new Label(j,i,"ghjgjhgjhgjg"); // Cell Structure 
			ws.addCell(L);
		}
	}
	wk.write(); // For saving the file 
	wk.close();// For closing the file 
}
}
