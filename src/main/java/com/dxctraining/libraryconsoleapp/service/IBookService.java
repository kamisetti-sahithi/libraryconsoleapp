package com.dxctraining.libraryconsoleapp.service;
import java.util.*;
import com.dxctraining.libraryconsoleapp.entities.*;


public interface IBookService {
	Book findBookbyId(String id);
	Book findBookByName(String bookName);
	Book save(Book book);
	Book updateBookcost(Book book);
	void remove(String id);
	

}
