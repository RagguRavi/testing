package spring.core.PropertyEditorExample;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

public class SPIExample implements Converter<String, Address> {

	@Override
	public Address convert(String data) {
		System.out.println("========SPIExample convert()============");
		List<String> dataList=Arrays.asList(data.split(","));
		Address address=new Address(dataList.get(0), dataList.get(1), dataList.get(2));
		return address;
	}

}
