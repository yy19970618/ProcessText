package util;
//change
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class AddAuthor extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String authorid;
	private String name;
	private String age;
	private String country;
	public String getAuthorid() {
		return authorid;
	}
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String execute() {
		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_yanyu0618";//我连接的是主数据库  
		String user="052kllllz4";  
		String password="2l12zzikwj5m04hzhx4wh31xl55yl1ywk22hlm52";
    	Connection conn;
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			Statement stmt = conn.createStatement(); //创建Statement对象
            String sql1 = "INSERT INTO author VALUES ('"+Integer.valueOf(authorid)+"','"+name+"','"+Integer.valueOf(age)+"','"+country+"');";    //要执行的SQL
            stmt.executeUpdate(sql1);
            stmt.close();conn.close();
            return SUCCESS;
          
        }catch(Exception e)
        {
           e.printStackTrace();
           return ERROR;
        }
	}
}
