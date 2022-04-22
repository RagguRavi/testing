package core.java1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Test22 {
	public static void main(String args[]) {
//		System.out.println(ClassLoader.getre("abc.txt"));
	System.out.println(searchTextInFile("abc.txt", "hello"));
	}
	
	
	public static String searchTextInFile(String filePath,String word) {
		String resultString = null;
		try {
			File textFile = new File(filePath);
			if(textFile.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(textFile));
				System.out.println(br.lines().toString());
				System.out.println(br.readLine());
				br.close();
			} else {
				resultString = "File not found";
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultString;
	}
}
