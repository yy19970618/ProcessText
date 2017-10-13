<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>插入作者</title>
</head>
<body>
	<h3>您需要插入新作者(输入格式如：18，tom ,69,china)</h3>
        <s:form action="AddAuthor">
        <s:textfield name="authorid" label="AuthroID"/>
        <s:textfield name="name" label="Name"/>
        <s:textfield name="age" label="Age"/>
        <s:textfield name="country" label="Country"/>
        <s:submit/>
        </s:form>
        <input type="button" value="返回首页" onclick="window.location.href='http://yanyu0618.applinzi.com/start.jsp';"/>
	
</body>
</html>