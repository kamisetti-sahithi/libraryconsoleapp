package com.dxctraining.libraryconsoleapp.ui;
import com.dxctraining.libraryconsoleapp.exceptions.*;
import com.dxctraining.libraryconsoleapp.service.*;
import com.dxctraining.libraryconsoleapp.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

import javax.annotation.PostConstruct;

@Component

public class LibraryUi {
	@Autowired
    private ILibraryService service;
	@PostConstruct
	public void run() {
		Author author1=new Author("yasaswini");
		Author author2=new Author("sahithi");
		Author author3=new Author("pragati");
		Book book1=new Book("2A","embeddedsystems",300,author1);
		Book book2=new Book("2B","communication",400,author2);
		Book book3=new Book("2C","java",500,author3);
		service.addBook(book1);
		service.addBook(book2);
		service.addBook(book3);
		showBooks();
	}
	public void showBooks() {
		List<Book> list=service.displayAll();
		for(Book book:list) {
			booksdisplay(book);
		}
	}
	public void booksdisplay(Book book) {
		System.out.println("displayng books");
		Author name=book.getAuthor();
		System.out.println("author"+name.getName()+"book name"+book.getName()+"price"+book.getCost());
	}

}




