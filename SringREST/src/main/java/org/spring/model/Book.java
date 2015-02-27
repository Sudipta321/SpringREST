package org.spring.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;




@XmlType(propOrder = { "author", "name", "publisher", "isbn" })
//Allows to define the order in which the fields are written in the XML file ,Optional
public class Book implements Serializable{


	private static final long serialVersionUID = 1L;
	  private String name;
	  private String author;
	  private String publisher;
	  private String isbn;

 // name for your XML-Output:customization as wish

	@XmlElement(name = "title")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
