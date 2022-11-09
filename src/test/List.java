package test;
import java.io.File;
import java.util.Date;

public class List {

	public static void main(String a[]) {
		File file=new File("C:\\Users\\Tayyaba\\Documents");
		String[] fileList=file.list();
		for(String name:fileList) {
            System.out.println(name);
	}

}
}