<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>新增图书</title>
</head>
<body>
		<h2>新增一本图书，若作者不在库中还需增加作者信息</h2>
		<h3>新增一本图书(输入格式如：18，C语言，4，机械出版社，20030516，38)</h3>
        <s:form action="AddBook">
        <s:textfield name="isbn" label="ISBN"/>
        <s:textfield name="title" label="Title"/>
        <s:textfield name="authorid" label="AuthroID"/>
        <s:textfield name="publisher" label="Publisher"/>
        <s:textfield name="publishdate" label="PublishDate"/>
        <s:textfield name="price" label="Price"/>
        <s:submit/>
        </s:form>
        <input type="button" value="返回首页" onclick="window.location.href='http://yanyu0618.applinzi.com/start.jsp';"/>
	
</body>
</html>