package com.dxctraining.libraryconsoleapp.dao;
import com.dxctraining.libraryconsoleapp.entities.*;
import java.util.*;

public interface ILibraryDao {
	Book findBookbyId(String id);
	List<Book>displayAll();
	void addBook(Book book);
	Book updateBookCost(String id,double cost);
	void removeBook(String id);
	

}
