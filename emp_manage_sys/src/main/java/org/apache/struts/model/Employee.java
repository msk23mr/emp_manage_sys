package org.apache.struts.model;

import java.util.Date;

/**
 * 社員モデルクラス
 *
 * @author mori
 *
 */
public class Employee {
	/**
	 * 変数の宣言
	 */
	// 社員ID
	private String id;
	// パスワード
	private String password;
	// 社員名
	private String name;
	// 性別
	private boolean gender;
	// 生年月日
	private Date birth;
	// 出身地
	private String from;
	// 所属名
	private String division;

	/**
	 * 社員モデルのコンストラクタ -クラスが持つ変数を初期化
	 */
	public Employee() {
		this.id = null;
		this.password = null;
		this.name = null;
		this.gender = true;
		this.birth = new Date();
		this.from = null;
		this.division = null;
	}

	/**
	 * 社員IDのゲッタ
	 *
	 * @return String型
	 */
	public String getId() {
		return id;
	}

	/**
	 * 社員IDのセッタ
	 *
	 * @param id
	 *            int型
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * パスワードのゲッタ
	 *
	 * @return String型
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードのセッタ
	 *
	 * @param password
	 *            String型
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 社員名のゲッタ
	 *
	 * @return String型
	 */
	public String getName() {
		return name;
	}

	/**
	 * 社員名のセッタ
	 *
	 * @param name
	 *            String型
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 性別のゲッタ -true="男性" false="女性" -初期値=true
	 *
	 * @return boolean型
	 */
	public boolean isGender() {
		return gender;
	}

	/**
	 * 性別のセッタ -true="男性" false="女性" -初期値=true
	 *
	 * @param gender
	 *            boolean型
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	/**
	 * 生年月日のゲッタ
	 *
	 * @return Date型
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * 生年月日のセッタ
	 *
	 * @param birth
	 *            Date型
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * 出身地（都道府県）のゲッタ
	 *
	 * @return String型
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * 出身地（都道府県）のセッタ
	 *
	 * @param from
	 *            String型
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * 所属のゲッタ
	 *
	 * @return String型
	 */
	public String getDivision() {
		return division;
	}

	/**
	 * 所属のセッタ
	 *
	 * @param division
	 *            String型
	 */
	public void setDivision(String division) {
		this.division = division;
	}

}
