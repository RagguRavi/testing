package spring.core.PropertyEditorExample;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;

public class AddressEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String string) throws IllegalArgumentException {
	System.out.println("********* Hello Everyone ********* "+string);
	List<String> addressObject = Arrays.asList(string.split(","));
	setValue(new Address(addressObject.get(1),addressObject.get(0),addressObject.get(2)));
	}
}
