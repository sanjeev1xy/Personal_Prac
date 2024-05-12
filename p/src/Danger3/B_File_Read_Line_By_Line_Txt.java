package Danger3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class B_File_Read_Line_By_Line_Txt 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("../p/Test_Data/File_Read.txt");
	FileReader fr=new FileReader(f); // FileReader is inbuild java class 
                                       // and FileReader reading the data Character by character
	BufferedReader br=new BufferedReader(fr); // Bufferedreader is inbuild java class 
                                              // and BufferedReader  reading the data Line by Line 
	String s;
	while((s=br.readLine())!=null)
	{
		System.out.println(s);
	}
}
}
