package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteBook extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private static int isbn;
	public static int getIsbn() {
		return isbn;
	}
	public static void setIsbn(int isbn) {
		DeleteBook.isbn = isbn;
	}
	public String execute() {
		Connection conn;
		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_yanyu0618";//我连接的是主数据库  
		String user="052kllllz4";  
		String password="2l12zzikwj5m04hzhx4wh31xl55yl1ywk22hlm52";
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			Statement stmt = conn.createStatement(); //创建Statement对象
			String sql = "delete from book where isbn='"+isbn+"';";    //要执行的SQL
			stmt.executeUpdate(sql);
			stmt.close();conn.close();return SUCCESS;
        }catch(Exception e)
        {
           e.printStackTrace();
           return ERROR;
        }
	}
}
