package org.apache.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String msg;

	public IndexAction() {
		msg = null;
	}

	@Override
	public String execute() throws Exception {
		setMsg("Hello Struts 2");
		return SUCCESS;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
