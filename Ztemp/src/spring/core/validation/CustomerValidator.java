package spring.core.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CustomerValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "customerName", "cutomer.valid");
		
		Customer customer=(Customer)target;
		
		if(customer.getCid()<0) {
			errors.reject("cid","cid cannot be negative");
		}
		
	}


}
