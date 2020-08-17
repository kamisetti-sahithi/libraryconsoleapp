package com.dxctraining.libraryconsoleapp.dao;
import com.dxctraining.libraryconsoleapp.entities.*;
import com.dxctraining.libraryconsoleapp.exceptions.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class LibraryDaoImpl implements ILibraryDao {
	private Map<String,Book> store=new HashMap<>();
	@PersistenceContext
	private int generatedid;
	public String generatedId() {
		generatedid++;
		String strid=""+generatedid;
		return strid;
	}

	@Override
	public Book findBookbyId(String id) {
		Book book=store.get(id);
		if(book==null) {
			throw new BookNotFoundException("book not found");
			
		}
		
		return book;
	}
	

	@Override
	public List<Book> displayAll() {
		Collection<Book> displaybook=store.values();
		List<Book> list=new ArrayList<>();
		for(Book book:displaybook) {
			list.add(book);
		}
		
		
		return list;
	}

	@Override
	public void addBook(Book book) {
		String id=book.getId();
		store.put(id,book);
		book.setId(id);
		
		
		
	}

	@Override
	public Book updateBookCost(String id, double cost) {
		Book book=findBookbyId(id);
		book.setCost(cost);
		
		return book;
	}

	@Override
	public void removeBook(String id) {
		store.remove(id);
		
	}
	
	

}



