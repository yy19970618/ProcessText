package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ExpressBooks extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String isbn;
	public String execute() {
		Connection conn;
		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_yanyu0618";//我连接的是主数据库  
		String user="052kllllz4";  
		String password="2l12zzikwj5m04hzhx4wh31xl55yl1ywk22hlm52";
		Statement stmt;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			stmt = conn.createStatement(); //创建Statement对象
			String sql1="select * from book where ISBN='" +Integer.valueOf(isbn)+ "';";
			ResultSet rs = stmt.executeQuery(sql1);
			if(rs.next()) {
				String title=rs.getString("Title");
				int id=rs.getInt("AuthorID");
				String authorid=Integer.toString(id);
				String publisher=rs.getString("Publisher");
				String publishdate=rs.getString("PublishDate");
				String price = Float.toString(rs.getFloat("Price"));
				ActionContext.getContext().put("isbn", isbn);
				ActionContext.getContext().put("title", title);
				ActionContext.getContext().put("authorid", authorid);
				ActionContext.getContext().put("publisher", publisher);
				ActionContext.getContext().put("publishdate", publishdate);
				ActionContext.getContext().put("price", price);
				String sql2 = "select * from author where AuthorID='" +id+ "';";
				ResultSet rs2 = stmt.executeQuery(sql2);
				if(rs2.next()) {
					String name=rs2.getString("Name");
					String age=Integer.toString(rs2.getInt("Age"));
					String country=rs2.getString("Country");
					ActionContext.getContext().put("name", name);
					ActionContext.getContext().put("age", age);
					ActionContext.getContext().put("country",country);
					rs.close();rs2.close();stmt.close();conn.close();//关闭
					return SUCCESS;
				}
				else return ERROR;
			}
			else return ERROR;
		}catch(Exception e)
        {
           e.printStackTrace();
           return ERROR;
        }
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
