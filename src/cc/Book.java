package cc;

//git change1
public class Book{
    private String mISBN;
    private String mTitle;
    private String mAuthorID;
    private String mPublisher;
    private String mPublishDate;
    private String mPrice;
    private String mName;
    private String mAge;
    private String mCountry;
    
    public void setISBN(String ISBN){
    	this.mISBN=ISBN;
    }
    public String getISBN(){
    	return mISBN;
    }
    
    public void setTitle(String Title){
    	this.mTitle=Title;
    }
    public String getTitle(){
    	return mTitle;
    }
    public void setAuthorID(String AuthorID) {
		this.mAuthorID = AuthorID;
	}
	public String getAuthorID() {
		return mAuthorID;
	}
	public String getPublisher() {
		return mPublisher;
	}
	public void setPublisher(String Publisher) {
		this.mPublisher = Publisher;
	}
	public String getPublishDate() {
		return mPublishDate;
	}
	public void setPublishDate(String PublishDate) {
		this.mPublishDate = PublishDate;
	}
	public String getPrice() {
		return mPrice;
	}
	public void setPrice(String Price) {
		this.mPrice = Price;
	}
	public String getName() {
		return mName;
	}
	public void setName(String Name) {
		this.mName = Name;
	}
	public String getAge() {
		return mAge;
	}
	public void setAge(String Age) {
		this.mAge = Age;
	}
	public String getCountry() {
		return mCountry;
	}
	public void setCountry(String Country) {
		this.mCountry = Country;
	}
	
}