package spring.core.PropertyEditorExample;

import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter<T extends Enum> implements Converter<String, T> {

	public Class<T> type;
	public StringToEnumConverter(Class<T> type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	@Override
	public T convert(String source) {
		return (T) Enum.valueOf(type, source.trim());
	}

}
