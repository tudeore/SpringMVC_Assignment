package com.cg.app.employee.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cg.app.employee.pojo.Employee;

@Component
public class EmployeeValidator implements Validator {


	public void validate(Object target,Errors errors) {
		
		Employee employee = (Employee) target;
		if(employee.getEmpName().length()<2) {
			errors.rejectValue("empName", "empname.legnth","Employee Name must have 2 charachters");
		}
		if(employee.getSalary()<100000) {
			errors.rejectValue("salary", "salary.minimum","Salary must be higher than 100000");
			
		}
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
