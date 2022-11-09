package test;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.PrintWriter;
import java.io.IOException; 


public class PrintWriterEx {

	public static void main(String[] args) throws Exception {
		
		//Data to write on console using PrintWriter		
		PrintWriter pw = new PrintWriter(System.out);
	    pw.write("My name is Tayyaba Khan");
		pw.flush();
		pw.close();
		
		//Data to write in file using PrintWriter
		PrintWriter writer1=null;
		writer1 =new PrintWriter(new File("C:\\Users\\Tayyaba\\Documents.text"));
		writer1.write("Tayyaba ");
				
		writer1.flush();
		writer1.close();
				 };
			}
		




	


