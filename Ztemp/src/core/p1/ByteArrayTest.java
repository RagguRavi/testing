package core.p1;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.context.annotation.DependsOn;

import core.p1.ByteArrayTest.C;
import io.jsonwebtoken.lang.Collections;


@DependsOn

public class ByteArrayTest {
	public static void main(String[] args) {
		
		Long.valueOf("abcd");

		List<Byte> li = IntStream.range(-128, 127).boxed().map(String::valueOf).map(Byte::valueOf).toList();
		
		byte arr[] = new byte[li.size()];
		for(int i=0;i<li.size();i++) {
			arr[i] = li.get(i);
		}
		
//		byte arr[] = IntStream.iterate(1, i ->random.nextInt(128)).limit(1000).mapToObj(i -> (byte)i);
		System.out.println(Arrays.toString(arr));
		
		ByteArrayInputStream bais = new ByteArrayInputStream(arr);
		
		
	}
	
	
	static class A {
		public static void main(String[] args) {
			Optional<String> op = Optional.of("ravi");
//			op.is
		}
	}
	
	static class B extends A {
		
	}
	
	class C extends A {
		
	}
}

