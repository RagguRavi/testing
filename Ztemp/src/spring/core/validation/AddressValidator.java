package spring.core.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class AddressValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Address.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors, "city", "city cannot be blank");
		ValidationUtils.rejectIfEmpty(errors, "state", "state cannot be blank");
		ValidationUtils.rejectIfEmpty(errors, "street", "street cannot be blank");
	}

}
