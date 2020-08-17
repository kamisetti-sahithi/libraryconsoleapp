package com.dxctraining.libraryconsoleapp.service;
import java.util.*;
import com.dxctraining.libraryconsoleapp.entities.*;


public interface ILibraryService {
	Book findBookbyId(String id);
	List<Book>displayAll();
	void addBook(Book book);
	Book updateBookcost(String id,double cost);
	void removeBook(String id);


}
