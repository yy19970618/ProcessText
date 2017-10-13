<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>更新图书</title>
</head>
<body>
		<h3>更新图书信息(输入格式如新增书籍)，如果更新的作者不在作者库，您还需要新增作者</h3>
        <s:form action="RefreshBook">
        <s:textfield name="isbn" label="ISBN"/>
        <s:textfield name="authorid" label="AuthroID"/>
        <s:textfield name="publisher" label="Publisher"/>
        <s:textfield name="publishdate" label="PublishDate"/>
        <s:textfield name="price" label="Price"/>
        <s:submit/>
        </s:form>
        <input type="button" value="返回首页" onclick="window.location.href='http://yanyu0618.applinzi.com/start.jsp';"/>
	
</body>
</html>