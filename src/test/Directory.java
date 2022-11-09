package test;
import java.io.File;

public class Directory {

	public static void main(String[] args) {
		File my_file_dir=new File("C:\\Users\\Tayyaba\\Documents");
		if(my_file_dir.exists())
		{
         System.out.println("The directory or file exist.\n");
	     }
		else
		{
			System.out.println("The directory or file does not exist.\n");
		}
}
}