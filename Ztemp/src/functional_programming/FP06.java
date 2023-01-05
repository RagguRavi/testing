package functional_programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;

public class FP06 {

	public static void main(String[] args) throws IOException {
//		Files.lines(Paths.get("file.txt")).forEach(System.out::println);
		
		System.out.println(
				Files.lines(Paths.get("file.txt")).map(l -> l.split(" ")).flatMap(Arrays::stream).distinct().count()
		);
	}

}
