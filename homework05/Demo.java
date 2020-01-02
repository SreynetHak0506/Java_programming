package homework05;
import java.util.*;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		Book book1 = new Book("Don't make me think","Steve Krung",2000);
		book1.borrow();
		Book book2 = new Book("Pro Java Programming","Terrill" ,2005);
		book2.returnBook();
		Book book3 = new Book("Programming in Python 3" , "Mark Summerfield",2005);
		book3.borrow();
		Book book4 = new Book("The Clean Coder","Robert",2011);
		book4.borrow();
		Book book5 = new Book("The Art of Agile Development","James Shore",2007);
		book5.returnBook();
		Book book6 = new Book("Head First Design Patterns","Eric Freeman",2004);
		book6.returnBook();
		Book book7 = new Book("The Linux Command Line", "Willian",2009);
		book7.borrow();
		Book book8 = new Book("Code Complete", "Steve",1993);
		book8.returnBook();
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		book9.returnBook();
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		book10.borrow();
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		System.out.println(book6.toString());
		System.out.println(book7.toString());
		System.out.println(book8.toString());
		System.out.println(book9.toString());
		System.out.println(book10.toString());
		
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.printf("%1$-30s %2$-20s %3$-20s %4$-20s","TITLE","AUTOR","YEAR","STATUS");
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------");
		for( Book Book: books) {
			System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s",
					Book.getTitle(),Book.getAuthor(),Book.getPublishYear(),Book.isBorrowed());
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------------");

	}

}
