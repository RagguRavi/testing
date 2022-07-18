package core.java;

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
		
		String str = "29273696,29287229,29273701,29284019,29281583,29287237,29287240,29265286,29287243,29273703,29287249,29287247,29287256,29283994,29287254,29266567,29287262,29265601,29266542,29287267,29287272,29285664,29266481,29287282,29287293,29287288,29287297,29283530,29265288,29287304,29287311,29287312,29287314,29287317,29287318,29287320,29287324,29287325,29287327,29287329,29287335,29287322,29287348,29287334,29287332,29284011,29287336,29273702,29287337,29265602";
		
		System.out.println(str.split(",").length);
	}
	
	static void  compare(String str) {
		String a ="aaa";
		
		System.out.println((str == a));
	}
}
