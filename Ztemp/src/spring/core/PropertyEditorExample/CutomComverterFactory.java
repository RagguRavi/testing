package spring.core.PropertyEditorExample;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class CutomComverterFactory implements ConverterFactory<String, Enum<?>> {

	@Override
	public <T extends Enum<?>> Converter<String, T> getConverter(Class<T> arg0) {
		// TODO Auto-generated method stub
		A a=new A();
		return null;
		
	}

	
}


class A<T1,T2,T3> {
	
	T1 stringToInt(T2 t) {
		return null;
	}
}
