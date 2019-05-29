package core.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test18 {
	public static void main(String[] args) throws IOException {
		/*System.out.println(System.getProperty("user.dir"));
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
		}*/
	
//		System.out.println(file.exists()+"\t"+file.getAbsolutePath()+"\t"+file.getCanonicalPath());
		/*
		String a ="aaa";
		String a1 = "aaa";
		System.out.println((a == a1));
		compare("aaa");*/
		
		List<String> list = Arrays.asList("\"aaaaa\"","\"bbbbb\"","\"ccccc\"","\"ddddd\"");
		
		System.out.println(list.toString());
	}
	
	static void  compare(String str) {
		String a ="aaa";
		
		System.out.println((str == a));
	}
}
