package util;
//changes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.opensymphony.xwork2.ActionSupport;

public class AddBook extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String title;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
            String sql1 = "INSERT INTO book VALUES ('"+Integer.valueOf(isbn)+"','"+title+"','"+Integer.valueOf(authorid)+"','"+publisher+"','"+publishdate+"','"+Float.parseFloat(price)+"');";    //要执行的SQL
            stmt.executeUpdate(sql1);
            String sql2 = "select Name from author where AuthorID='"+Integer.valueOf(authorid)+"';";
            if((stmt.executeQuery(sql2)).next()) {
            	stmt.close();conn.close();
            	return SUCCESS;
            }
            else
            	return LOGIN;
        }catch(Exception e)
        {
           e.printStackTrace();
           return ERROR;
        }
	}
}
