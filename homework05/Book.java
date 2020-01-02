package homework05;

public class Book {
	private String title;
	private	String author;
	private int publishYear ;
	private boolean isBorrowed = true;
   
  public Book(String title, String author, int publishYear) {
	  this.title = title;
	  this.author = author;
	  this.publishYear = publishYear;
  }
  void borrow() {
	  isBorrowed = true;
  }
  void returnBook() {
	  isBorrowed = false;
  }
  String getTitle() {
	  return title;
  }
  
  String getAuthor() {
	  return author;
  }
  int getPublishYear() {
	  return publishYear;
  }
 public  String isBorrowed() {
	  String outPut ;
	  if(isBorrowed) {
		  outPut = "Not Available ";
	  }else {
		  outPut = "Available ";
	  }
	  return outPut;
  }
  public String toString() {
	
	  return ( "Title:" + " "+ title +  "\n\t" + "by" + " "  + author +"--published" +" " +publishYear +"\n\t" + "Status:" +   isBorrowed() + "to Borrow");
  }
	  
  }
