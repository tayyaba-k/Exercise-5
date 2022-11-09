package test;
import java.io.BufferedWriter;
import java.io.FileWriter; 
 
import java.io.IOException; 

public class WriteToFile{
	public static void main(String args[]) { 
		 try { 
		 FileWriter writer = new FileWriter("C:\\Users\\Tayyaba\\Documents.txt");
		 BufferedWriter bwr = new BufferedWriter(writer);
		 
		 bwr.write("Tayyaba");
		 bwr.write("Sarah"); 
		 bwr.write("Shweta"); 
		 
		// bwr.close(); 
		 System.out.println("succesfully written to a file");
		 
		 } catch (IOException ioe) {
			 ioe.printStackTrace(); 
		 }
	}
}


