<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
<s:head></s:head>
</head>
<body>
<!-- ページタイトル -->
<h2>ログインしてください</h2>

<p>
<!-- ログイン処理のエラーメッセージはココに追加してください -->
</p>

<!-- ログインフォーム -->
<s:form action="login">
	<!-- 社員IDのテキストフォーム -->
	<s:textfield key="employeeBean.id"></s:textfield>
	<!-- パスワードのテキストフォーム -->
	<s:textfield key="employeeBean.password"></s:textfield>
	<!-- サブミットボタン -->
	<s:submit></s:submit>
</s:form>

</body>
</html>