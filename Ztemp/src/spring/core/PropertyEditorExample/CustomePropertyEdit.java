package spring.core.PropertyEditorExample;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class CustomePropertyEdit implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry editorRegistry) {
		// TODO Auto-generated method stub
		System.out.println("******registerCustomeEditors*******");
		editorRegistry.registerCustomEditor(Address.class, new AddressEditor());
	}

}
