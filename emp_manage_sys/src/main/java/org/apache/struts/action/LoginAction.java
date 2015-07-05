package org.apache.struts.action;

import org.apache.struts.model.Employee;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	// 社員モデルオブジェクトを宣言
	private Employee employeeBean;

	@Override
	public String execute() throws Exception {
		// ココにログイン処理を書きます
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		return INPUT;
	}

	@Override
	public void validate() {
		// ココにフォームからの入力チェック処理を書きます

		// if文で条件を指定して
		if (employeeBean.getId().length() != 4) {
			// addFieldErrorメソッドで、対象フォームとエラーメッセージを書きます
			addFieldError("employeeBean.id", "社員IDの文字数を確認してください。");
		}
	}

	/**
	 * 社員モデルオブジェクトのゲッタ
	 *
	 * @return Employee型
	 */
	public Employee getEmployeeBean() {
		return employeeBean;
	}

	/**
	 * 社員モデルオブジェクトのセッタ
	 *
	 * @param Employee型
	 *            employeeBean
	 */
	public void setEmployeeBean(Employee employeeBean) {
		this.employeeBean = employeeBean;
	}
}
