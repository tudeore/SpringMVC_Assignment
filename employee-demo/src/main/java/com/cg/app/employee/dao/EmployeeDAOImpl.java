package com.cg.app.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.app.employee.pojo.Employee;
import com.cg.app.employee.sigaltan.SQLQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate template;

	@Override
	public void addNewEmployee(Employee employee) {
		// TODO Auto-generated method stub
		template.update(SQLQuery.getInstance().insertQuery(),new Object[] {employee.getEmpId(),employee.getEmpName(),
				employee.getSalary()});
	}

}
