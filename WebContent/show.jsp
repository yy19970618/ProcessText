<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>图书详细信息</title>
    </head>
    <body>
    <h1>查询得到的图书详细信息如下</h1>
   	<p>ISBN= <s:property  value="#isbn" /></p>
   	<p>Title=<s:property value="#title"/></p>
    <p>AuthorID=<s:property  value="#authorid" /></p>
    <p>Publisher=<s:property  value="#publisher" /></p>
    <p>PublishDate=	<s:property  value="#publishdate" /></p>
    <p>Price=	<s:property  value="#price" /></p>
    <h1>查询得到的作者详细信息如下</h1>
    <p>AuthorID=<s:property  value="#authorid" /></p>
    <p>Name=	<s:property  value="#name" /></p>
    <p>Age=	<s:property  value="#age" /></p>
    <p>Country=	<s:property  value="#country" /></p>
    <input type="button" value="返回首页" onclick="window.location.href='http://yanyu0618.applinzi.com/start.jsp';"/>
	
    </body>
</html>