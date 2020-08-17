package com.dxctraining.libraryconsoleapp.service;
import com.dxctraining.libraryconsoleapp.dao.*;
import com.dxctraining.libraryconsoleapp.entities.*;
import com.dxctraining.libraryconsoleapp.exceptions.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service
public class LibraryServiceImpl implements ILibraryService {
	@Autowired
	private ILibraryDao dao;
	

	@Override
	public Book findBookbyId(String id) {
		checkbookId(id);
		Book book=dao.findBookbyId(id);
		
		return book;
	}
	public void checkbookId(String id) {
		if(id==null || id.isEmpty()) {
			throw new InvalidArgumentException("null or empty is id");
		}
	}

	@Override
	public List<Book> displayAll() {
		List<Book> list=dao.displayAll();
		
		return list;
	}

	@Override
	public void addBook(Book book) {
		dao.addBook(book);
		
	}

	@Override
	public Book updateBookcost(String id, double cost) {
		checkbookId(id);
		checkbookCost(cost);
		Book book=dao.updateBookCost(id, cost);
		
		return book;
		
	}
	public void checkbookCost(double cost) {
		if(cost==0 || cost<0) {
			throw new InvalidArgumentException("invalid cost");
		}
	}

	@Override
	public void removeBook(String id) {
		checkbookId(id);
		dao.removeBook(id);
		
		
	}
	

}



