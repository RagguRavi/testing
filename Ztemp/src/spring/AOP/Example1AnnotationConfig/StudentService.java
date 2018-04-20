package spring.AOP.Example1AnnotationConfig;

import java.io.Serializable;


public class StudentService implements TargetInterface{

	void helloStudent(Serializable serializable) {
		System.out.println("This is hello Student" +serializable);
	}
}
