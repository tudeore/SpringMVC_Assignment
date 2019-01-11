package com.cg.app.employee.sigaltan;

import java.util.ResourceBundle;

public final class SQLQuery {

	private static SQLQuery sqlQuery = new SQLQuery();
	
	private SQLQuery() {
		
	}
	
	public static SQLQuery getInstance() {
		return sqlQuery;
	}
	
	public String insertQuery() {
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("sql-Queries");
		return resourceBundle.getString("INSERT_EMPLOYEE");
	}
}
