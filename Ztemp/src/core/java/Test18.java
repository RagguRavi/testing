package core.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test18 {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("line.separator")+"\t je;e;pp");
		File file = new File("src/core/java/a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		while(true) {
			int cha = fileInputStream.read();
			if(cha != -1) {
				System.out.print((char)cha +"\t"+cha);
			} else {
				break;
			}
		}
	
//		System.out.println(file.exists()+"\t"+file.getAbsolutePath()+"\t"+file.getCanonicalPath());
		
	}
}
