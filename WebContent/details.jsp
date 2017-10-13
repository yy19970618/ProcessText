<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>说明书</title>
</head>
<body>
	<h3>改变</h3>
	<h2>本图书查询网站实现了一下五个功能</h2>
	<h3>输入作者名字，查询该作者所著的全部图书的题目；</h3>
	<h3>当用户点击某本图书的题目时，展示图书详细信息和作者详细信息；</h3>
	<h3>当用户点击“删除”按钮时，将对应行的图书从数据表中删除；</h3>
	<h3>(选做) 用户可新增一本图书，若该书作者不在库中，还需增加新作者；</h3>
	<h3>(选做) 用户可更新一本图书的作者、出版社、出版日期、价格。</h3>
	<h2>在首页上显示了功能一，四，五的入口</h2>
	<h2>功能二，三的实现通过功能一查询出来的图书列表体现，你可以点击图书名字查询图书详细资料，可以点击删除按钮删除图书</h2>
	<h2>注意您插入书籍的isbn号不能是数据库中已经存在的！</h2>
	<input type="button" value="返回首页" onclick="window.location.href='http://yanyu0618.applinzi.com/start.jsp';"/>
		
</body>
</html>