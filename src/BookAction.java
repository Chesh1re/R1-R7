import java.util.List;

public class BookAction{
	private String authorname;
	private List<String> books;
	private cc.Book onebook;
	private String title;
	private String lastname;
	private int DeleteFlag;
	public String searchBooks(){
		DBConnection Search=new DBConnection();
		books =Search.SearchAction(authorname);
		//System.out.println(authorname);
		System.out.println("8");
		return "success";
	}
	public String showBook1(){
		DBConnection Search2=new DBConnection();
		//System.out.println(title);
		onebook = Search2.SearchBook(title);
		//System.out.println(authorname);
		System.out.println(onebook.getTitle());
		System.out.println("9");
		return "success";
	}
	public String Delete(){
		DBConnection Delete=new DBConnection();
		Delete.BookDeleteAction(title);
		//System.out.println(title);
		Delete.SearchAction(lastname);
		DeleteFlag=1;
		System.out.println("10");
		return "success";
		}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
		System.out.println("11");
	}
    public String getAuthorname(){
    	System.out.println("12");
    	return authorname;
    	
    }
	public void setTitle(String title) {
		System.out.println("13");
		this.title = title;
	}

	public List<String> getBooks() {
		System.out.println("14");
		return books;
	}

	public void setLastname(String lastname) {
		System.out.println("15");
		this.lastname=lastname;
	}
	public cc.Book getOnebook() {
		System.out.println("16");
		System.out.println(onebook.getISBN()+"--"+onebook);
		return onebook;
	}
/*	public void setOnebook(Book onebook) {
		System.out.println(onebook.getISBN()+"--"+onebook);
		this.onebook = onebook;
	}*/
	public int getDeleteFlag() {
		System.out.println("17");
		return DeleteFlag;
	}
	public void setDeleteFlag(int deleteFlag) {
		System.out.println("18");
		DeleteFlag = deleteFlag;
	}
	
	
}
