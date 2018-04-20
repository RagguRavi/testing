package core.java;

import java.io.File;

public class CreateFolderToC {
	public static void main(String[] args) {
		File dir = new File("ek//do//teen//char");
		if(!dir.exists()) {
			boolean isCreated = dir.mkdirs();
			System.out.println(isCreated);
		}
	}
}
