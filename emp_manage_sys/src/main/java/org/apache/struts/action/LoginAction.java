package org.apache.struts.action;

import org.apache.struts.model.Employee;
import org.apache.struts.service.EmployeeDataForTestService;
import org.apache.struts.service.EmployeeDataService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	// 社員モデルオブジェクト
	private Employee employeeBean;
	// 社員データ取得オブジェクト
	private EmployeeDataService employeeDataService;
	// ログイン失敗メッセージ
	private String loginErrorMessage;

	/**
	 * コンストラクタ
	 */
	public LoginAction() {
		employeeDataService = new EmployeeDataForTestService();
		loginErrorMessage = null;
	}

	@Override
	public String execute() throws Exception {
		// ココにログイン処理を書きます

		// 社員データの取得
		employeeDataService.loadEmployeeData(employeeBean.getId());

		// ログインフォームに入力されたパスワードと取得したパスワードの比較
		if (employeeBean.getPassword().equals(
				employeeDataService.getEmployee().getPassword())) {
			return SUCCESS;
		} else {
			// ログイン失敗メッセージをセット
			loginErrorMessage = "ログインに失敗しました : "
					+ employeeDataService.getEmployee().getPassword();
			return INPUT;
		}

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

	/**
	 * ログインエラーメッセージのゲッタ
	 *
	 * @return String型
	 */
	public String getLoginErrorMessage() {
		return loginErrorMessage;
	}

}
