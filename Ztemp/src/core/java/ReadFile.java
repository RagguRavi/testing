package core.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;

public class ReadFile {
	public static String BASE_URL = "https://sellerzone.tatacliq.com/faces/jsp/regenrateInvoice?shipmentID=";
	public static void main(String args[]) {
		
		try {
			File file = new File("src/core/java/ravi.txt");
			File writeToFile = new File("src/core/java/a.txt");
			System.out.println(file.exists());
			String str = Files.readString(file.toPath());
			System.out.println(str);
			
			String [] arr = str.split(",");
			
			int splitCounter = 50;
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(writeToFile));
			
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]);
				
				if((i+1)%splitCounter == 0) {
					bw.append("\n\n\n");
					bw.append(BASE_URL+sb.toString());
					System.out.println("\n\n"+sb.toString());
					sb = new StringBuffer();
				} else {
					sb.append(",");
				}
				
			}
			bw.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
