package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;

public class RefreshBook extends ActionSupport {
	//change
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String authorid;
	private String publisher;
	private String publishdate;
	private String price;
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthorid() {
		return authorid;
	}

	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(String pulishdate) {
		this.publishdate = pulishdate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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
			String sql = "update book set AuthorID=?,Publisher=?,PublishDate=?,Price=? where ISBN=?";

	        PreparedStatement ptmt = (PreparedStatement) conn.prepareStatement(sql);
	        ptmt.setInt(1, Integer.valueOf(authorid));
	        ptmt.setString(2, publisher);
	        ptmt.setString(3, publishdate);
	        ptmt.setFloat(4, Float.parseFloat(price));
	        ptmt.setInt(5, Integer.valueOf(isbn));

	        ptmt.execute();
	        
	        String sql2 = "select Name from author where AuthorID='"+Integer.valueOf(authorid)+"';";
            if((stmt.executeQuery(sql2)).next()) {
            	ptmt.close();stmt.close();conn.close();
            	return SUCCESS;
            }
            else {
            	ptmt.close();stmt.close();conn.close();
            	return LOGIN;
            }
            	
        }catch(Exception e)
        {
           e.printStackTrace();
           return ERROR;
        }
	}

}
