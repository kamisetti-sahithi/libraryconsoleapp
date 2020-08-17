package com.dxctraining.libraryconsoleapp.ui;
import com.dxctraining.libraryconsoleapp.exceptions.*;
import com.dxctraining.libraryconsoleapp.service.*;
import com.dxctraining.libraryconsoleapp.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

import javax.annotation.PostConstruct;

@Component

public class BookUi {
	@Autowired
    private IBookService service;
	@PostConstruct
	public void run() {
		try {
		Author author1=new Author("1A","yasaswini");
		Author author2=new Author("1B","sahithi");
		Author author3=new Author("1C","pragati");
		Book book1=new Book("2A","embeddedsystems",300,author1);
		Book book2=new Book("2B","communication",400,author2);
		Book book3=new Book("2C","java",500,author3);
		service.save(book1);
		service.save(book2);
		service.save(book3);
		String id1 = book1.getId();
    Book fetched1 = service.findBookbyId(id1);
    System.out.println("book id =" + fetched1.getId() + " book name" + fetched1.getName() + "book cost " + fetched1.getCost());
    Book fetched2 = service.findBookbyId(id1);
    System.out.println("book id =" + fetched2.getId() + " book name" + fetched2.getName() + "book cost " + fetched2.getCost());
    Book fetched3 = service.findBookbyId(id1);
    System.out.println("book id =" + fetched3.getId() + " book name" + fetched3.getName() + "book cost " + fetched3.getCost());

}
		catch (BookNotFoundException exp) {
	          exp.printStackTrace();
	      } 
	}
}




