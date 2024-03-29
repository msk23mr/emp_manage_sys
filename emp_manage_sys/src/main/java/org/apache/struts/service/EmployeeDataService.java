package org.apache.struts.service;

import org.apache.struts.model.Employee;

public interface EmployeeDataService {

	/**
	 * 社員モデルオブジェクトのゲッタ
	 *
	 * @return Employee型
	 */
	Employee getEmployee();

	/**
	 * 社員モデルオブジェクトのセッタ
	 *
	 * @param employee
	 */
	void setEmployee(Employee employee);

	/**
	 * 社員データを取得するメソッド
	 */
	void loadEmployeeData();
}
