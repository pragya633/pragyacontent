package com.cg.lib.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cg.lib.exception.LibException;
import com.cg.lib.model.Book;

public class BookDaoImpl implements BookDao {
	private Map<Integer, Book> booksMap;
	public BookDaoImpl(){
		booksMap=new TreeMap<>();
	}

	@Override
	public void addBook(Book book) throws LibException {
		// TODO Auto-generated method stub
		if(book!=null && !booksMap.containsKey(book.getBookCode()))
		{
			booksMap.put(book.getBookCode(), book);
		}
		else{
			throw new LibException("No book or duplicate book received");
		}
	}

	@Override
	public void updateBook(Book book) throws LibException {
		// TODO Auto-generated method stub
		if(book!=null && booksMap.containsKey(book.getBookCode()))
		{
			booksMap.replace(book.getBookCode(), book);
		}
		else{
			throw new LibException("No such book found");
		}
		
	}

	@Override
	public void deleteBook(int bookCode) throws LibException {
		if(booksMap.containsKey(bookCode))
		{
			booksMap.remove(bookCode);
		}
		else{
			throw new LibException("No such book found");
		}
		
	}

	@Override
	public Book getBookById(int bookCode) {
		// TODO Auto-generated method stub
		return booksMap.get(bookCode);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return new ArrayList<>(booksMap.values());
	}

}
