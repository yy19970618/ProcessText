<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>图书查询界面</title>
    </head>
    <body>
        <h3>查询作者所著全部图书(在下面输入作者姓名即可) </h3>
        <s:form action="QueryAllBooks">
            Name: <s:textfield name="name" />
            <s:submit/>
        </s:form>
        <h3>新增图书入口</h3>
        <input type="button" value="新 增" onclick="window.location.href='http://yanyu0618.applinzi.com/addbook.jsp';"/>
		<h3>更新图书入口</h3>
		<input type="button" value="更 新" onclick="window.location.href='http://yanyu0618.applinzi.com/refreshbook.jsp';"/>
		<h3>说明书入口（如果您想了解本图书查询网站的功能组成请点击这里）</h3>
		<input type="button" value="说明书入口" onclick="window.location.href='http://yanyu0618.applinzi.com/details.jsp';"/>
    </body>
</html>