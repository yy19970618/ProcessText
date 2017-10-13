<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>查询得到</title>
    </head>
    <body>
        <h3>作者所著全部图书为 </h3>
        <table border="1">
        <tr>
        	<td>序号</td>
        	<td>ISBN</td>
        	<td>书籍名称</td>
        	<td>删除操作</td>
        </tr>
        
		<s:iterator value="books" id="cl" status="i">
		<tr>
            <td><s:property value="#i.index+1" /></td>
            <td>${cl.isbn}</td>
            <td><a href="http://yanyu0618.applinzi.com/ExpressBooks.action?isbn=${cl.isbn}" >${cl.title}</a></td>
            <td>
            	<input type="button" value="删 除" onclick="window.location.href='http://yanyu0618.applinzi.com/DeleteBook.action?isbn=${cl.isbn}';"/>
			</td>
        </tr>                 
		</s:iterator>
  		
  		</table>
  		<h3>    </h3>
  		<input type="button" value="返回首页" onclick="window.location.href='http://yanyu0618.applinzi.com/start.jsp';"/>
	
    </body>
</html>