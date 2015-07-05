package org.apache.struts.service;

import java.sql.Date;

import org.apache.struts.model.Employee;

public class EmployeeDataForTest implements EmployeeDataService {

	private Employee employeeBean;

	public EmployeeDataForTest() {
		employeeBean = new Employee();
	}

	@Override
	public Employee getEmployee() {
		return employeeBean;
	}

	@Override
	public void loadEmployeeData() {
		// このメソッドでデータの読み込みを行う
		// 一人分の社員データだけ読み込む

		// このクラスはテスト用なので、直接値を入れています
		// 本当なら、データベースへの問い合わせ
		employeeBean.setId("0001");
		employeeBean.setPassword("1111aaaa");
		employeeBean.setName("森 雅樹");
		employeeBean.setGender(true);
		employeeBean.setBirth(Date.valueOf("1986-06-03"));
		employeeBean.setFrom("北海道");
		employeeBean.setDivision("システム4部");
	}

}
