package Danger3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D_File_Append_Txt 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("../p/Test_Data/File_writer.txt");
	FileWriter fw=new FileWriter(f,true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.newLine();
	bw.write("Anyhow i have to chnage the job");
	bw.newLine();
	bw.write("Automation Isvery easy If you are practicing ");
	bw.close();
}
}
