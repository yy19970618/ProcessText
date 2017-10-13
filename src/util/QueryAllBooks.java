package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class QueryAllBooks extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();
    public class Book{
    	private int isbn;
    	private String title;
    	Book(int isbn,String title){
    		this.setIsbn(isbn);
    		this.setTitle(title);
    	}
		public int getIsbn() {
			return isbn;
		}
		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public String execute() {
    	Connection conn;
    	String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_yanyu0618";//�����ӵ��������ݿ�  
		String user="052kllllz4";  
		String password="2l12zzikwj5m04hzhx4wh31xl55yl1ywk22hlm52";
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			Statement stmt = conn.createStatement(); //����Statement����
            String sql1 = "select AuthorID from author where Name='"+name+"';";    //Ҫִ�е�SQL
            ResultSet rs = stmt.executeQuery(sql1);//�������ݶ���
            int id = 0;
            if(rs.next())
            	id=rs.getInt("AuthorID");
            else return null;
            
            String sql2 = "select ISBN,Title from book where AuthorID='" +id+ "';";
            ResultSet rs2 = stmt.executeQuery(sql2);
            if(rs2.next()) {
            	Book temp=new Book(rs2.getInt("ISBN"),rs2.getString("Title"));
            	books.add(temp);
            }
            else
            	return LOGIN;
            while(rs2.next()) {
            	Book temp=new Book(rs2.getInt("ISBN"),rs2.getString("Title"));
            	books.add(temp);
            }
            rs.close();rs2.close();stmt.close();conn.close();//�ر�
            return SUCCESS;
        }catch(Exception e)
        {
           e.printStackTrace();
           return ERROR;
        }
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

}
