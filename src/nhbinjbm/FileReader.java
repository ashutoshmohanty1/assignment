package nhbinjbm;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args)
	{
		File file = new File("E:\\javaProgam\\first\\src\\nhbinjbm\\data.txt");
		FileReader fr = new FileReader(file);
		int single;
		while((single = fr.read()) != -1) {
			System.out.print((char)single);
		}
		String content = null;
		BufferedReader br = new BufferedReader(fr);
		while((content = br.readline()) !=null) {
			System.out.println(content.split(" ").length -1);
		}
	}
}

