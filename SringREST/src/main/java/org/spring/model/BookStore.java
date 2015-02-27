package org.spring.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;



//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(name = "BookStore")

public class BookStore implements Serializable{

	  private static final long serialVersionUID = 1L;
	  private ArrayList<Book> bookList;
	  private String cardMemberName;
	  private long cardID;



	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public String getCardHolderName() {
		return cardMemberName;
	}
	public void setCardHolderName(String cardMemberName) {
		this.cardMemberName = cardMemberName;
	}
	public long getCardID() {
		return cardID;
	}
	public void setCardID(long cardID) {
		this.cardID = cardID;
	}

}
