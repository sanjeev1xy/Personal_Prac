package Danger3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C_File_Writer_Txt 
{
public static void main(String[] args) throws IOException 
{
	File F=new File("../p/Test_Data/File_writer.txt");
	FileWriter fw=new FileWriter(F); //FileWriter is inbuild java class 
                                    // and FileWriter write the data Character by character
	BufferedWriter bw=new BufferedWriter(fw); // BufferedWriter is inbuild java class 
                                              // and BufferedWriter  write  the data next line 
	bw.write("Automation is very easy");
	bw.newLine();
	bw.write("I want to become Automation Expert");
	bw.close();
}
}
