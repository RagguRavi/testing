package core.java;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("Enter Directory Name :");
				String path = scanner.nextLine();
				File file = new File(path);
				if(file.exists()) {
					if(file.isDirectory()) {
						System.out.println("Given path is pointed to directory Files and folder Showing below");
						for(String fi : file.list()) {
							System.out.println(fi);
						}
					} else {
						System.out.println("--------Given path pointed to file Details below:---------");
						System.out.println("Name "+file.getName()+"\tLast Modified "+new Date(file.lastModified()));
					}
				} else {
					System.err.println("Directory or File name which you entered not Exist");
				}
				System.out.println("==================================");
				System.out.println("Want to Search Again. Press Y :");
				char enteredKey = scanner.nextLine().charAt(0);
				if('Y' == enteredKey || 'y' == enteredKey) {
					continue;
				} else {
					System.out.println("thankyou");
					break;
				}
			}
		} catch(Exception e) {
			System.out.println("Error occur :"+e);
		} finally {
			scanner.close();
		}
	}
	
}
