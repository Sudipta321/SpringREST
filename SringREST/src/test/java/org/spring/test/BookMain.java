package org.spring.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.spring.model.Book;
import org.spring.model.BookStore;



public class BookMain {

	private static final String BOOKSTORE_XML = "./BookStore.xml";

	public static void main(String[] args) throws JAXBException, IOException {


		ArrayList<Book> blist = new ArrayList<Book>();

	    // create books
	    Book book1 = new Book();
	    book1.setIsbn("978-0060554736");
	    book1.setName("The Game");
	    book1.setAuthor("Neil Strauss");
	    book1.setPublisher("Harpercollins");
	    blist.add(book1);

	    Book book2 = new Book();
	    book2.setIsbn("978-3832180577");
	    book2.setName("Feuchtgebiete");
	    book2.setAuthor("Charlotte Roche");
	    book2.setPublisher("Dumont Buchverlag");
	    blist.add(book2);

	    // create bookstore, assigning book
	    BookStore bookstore = new BookStore();
	    bookstore.setName("Sudipta Sarkar");
	    bookstore.setLocation("Kolkata");
	    bookstore.setBookList(blist);

	    // create JAXB context and instantiate marshaller
	    JAXBContext context = JAXBContext.newInstance(BookStore.class,Book.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    // Write to System.out
	    m.marshal(bookstore, System.out);

	    // Write to File
	    m.marshal(bookstore, new File(BOOKSTORE_XML));

	 // get variables from our xml file, created before
	    System.out.println();
	    System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    BookStore bookstore2 = (BookStore) um.unmarshal(new FileReader(BOOKSTORE_XML));
	    ArrayList<Book> list = bookstore2.getBookList();
	    for (Book book : list) {
	      System.out.println("Book: " + book.getName() + " from "
	          + book.getAuthor());
           }
	    System.out.println("Book Store Name : "+bookstore2.getName()+" "+"Book Store Location : "+bookstore2.getLocation());

	}

}
