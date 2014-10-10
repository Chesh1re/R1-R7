
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import cc.Book;

public class DBConnection {
	private Connection con=null;
	private PreparedStatement ok=null;
	private ResultSet RS=null;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_cheshirec"; //"jdbc:mysql://127.0.0.1:3306/BookDB";
    String user = "lkmmonnyo2";//"root";
    String password = "zllzyxxzhj10w5jj4jxzh3j0xk5312mlhh33iw1x";
   // String url = "jdbc:mysql://127.0.0.1:3306/BookDB";
	//String user = "root";
    //String password = "csm0212";
    
	public DBConnection(){
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			System.out.println("19");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

    public List<String> SearchAction(String authorname){
    	List<Book> l = new ArrayList<Book>();
    	String sql="Select * from book,author where book.AuthorID=author.AuthorID and author.Name=?";
    	try {
    		System.out.println("22");
			ok=con.prepareStatement(sql);ok.setString(1,authorname);
		 	//ok.executeUpdate();
         	RS=ok.executeQuery();
    	    while(RS.next()){
    	   Book temp=new Book();
	    	    temp.setTitle(RS.getString("Title"));
	    	    temp.setAuthorID(RS.getString("AuthorID"));
	    	    temp.setISBN(RS.getString("ISBN"));
	    	    temp.setPrice(RS.getString("Price"));
	    	    temp.setPublishDate(RS.getString("PublishDate"));
	    	    temp.setPublisher(RS.getString("Publisher"));
	    	    temp.setName(RS.getString("Name"));
	    	    temp.setAge(RS.getString("Age"));
	    	    temp.setCountry(RS.getString("Country"));
	    		l.add(temp);
	    		//System.out.println(1);
    	    }
   	        } catch (SQLException e) {
			e.printStackTrace();
		    }
    	List<String>  n=new ArrayList<String>();
    	if (l != null) {
    		for (Book b : l) {
    	n.add(b.getTitle());
    	//System.out.println(b.getName());
    	}
    	}
    	
    	return n;
    }
    public cc.Book SearchBook(String bookname){
    	Book temp=new cc.Book();
    	String sql="Select * from book,author where book.AuthorID=author.AuthorID and book.Title=?";
    	try {
    		System.out.println("20");
			ok=con.prepareStatement(sql);ok.setString(1,bookname);
		 	//ok.executeUpdate();
         	RS=ok.executeQuery();
    	    while(RS.next()){
	    	    temp.setTitle(RS.getString("Title"));
	    	    temp.setAuthorID(RS.getString("AuthorID"));
	    	    temp.setISBN(RS.getString("ISBN"));
	    	    temp.setPrice(RS.getString("Price"));
	    	    temp.setPublishDate(RS.getString("PublishDate"));
	    	    temp.setPublisher(RS.getString("Publisher"));
	    	    temp.setName(RS.getString("Name"));
	    	    temp.setAge(RS.getString("Age"));
	    	    temp.setCountry(RS.getString("Country"));
	    	    
	    		//System.out.println(1);
    	    }
   	        } catch (SQLException e) {
			e.printStackTrace();
		    }
    	return temp;
    }
    
 
    public void BookDeleteAction(String title1){
    	System.out.println("21");
    	String sql="Delete from book where book.Title=?";
         	try {ok=con.prepareStatement(sql);ok.setString(1,title1);
				ok.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

    }
    //public List<String>
              
}
