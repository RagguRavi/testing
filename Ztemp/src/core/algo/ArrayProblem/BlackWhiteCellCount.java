package core.algo.ArrayProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class BlackWhiteCellCount {
	public static void main(String args[]) throws Exception {
		//BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
         System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        List<String> lines =  br.lines().collect(Collectors.toList());
        System.out.println(lines);
        for(String line: lines) {
        	System.out.println(line+"asfasdfas");
        }
        
        
	}
}
