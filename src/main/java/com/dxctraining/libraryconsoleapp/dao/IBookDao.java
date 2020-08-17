package com.dxctraining.libraryconsoleapp.dao;
import com.dxctraining.libraryconsoleapp.entities.*;
import java.util.*;

public interface IBookDao {
	Book findBookbyId(String id);
	Book findBookByName(String bookName);
	Book save(Book book);
	Book updateBookcost(Book book);
	void remove(String id);

}
