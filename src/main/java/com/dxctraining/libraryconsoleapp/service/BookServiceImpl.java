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
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookDao dao;
	

	@Override
    public Book findBookbyId(String id) {
        Book book= dao.findBookbyId(id);
        return book;
    }
    @Override
    public Book updateBookcost(Book book) {
        validate(book);
        book=dao.updateBookcost(book);
        return book;
    }
    @Override
    public void remove(String id) {
       dao.remove(id);
    }
    public Book save(Book book) {
        validate(book);
        book=dao.save(book);
        return book;
    }

    public void validate(Object obj){
        if(obj==null){
            throw new InvalidArgumentException("argument is null");
        }
    }

    @Override
    public Book findBookByName(String bookName) {
      Book book =dao.findBookByName(bookName);
       return book;
    }
}
