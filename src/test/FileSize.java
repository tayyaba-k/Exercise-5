package test;
import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		File file= new File("C:\\Users\\Tayyaba\\Documents");
		long fileSize=file.length();
		System.out.println("File size in MB is:" +(double)fileSize/(1024*1024));

	}

}
