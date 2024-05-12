package Danger3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A_File_Read_Txt
{
	
	//File = Connection Establish
	//FileReader= Character by Character read
	//BufferedReader= Line by Line read
	//FileWriter = For writing line
	//BufferedWriter= For Writing multiple lines
	
	
public static void main(String[] args) throws IOException 
{
	File f= new File("../p/Test_Data/File_Read.txt"); // make a connection between txt file 
	                                                  // and code and also paste the path
	  FileReader fr=new FileReader(f); // FileReader is inbuild java class 
	                                   // and FileReader reading the data Character by character
	  int a;
	  while((a=fr.read())!=-1)
	  {
		 System.out.println((char)a);
	  }
}
}
