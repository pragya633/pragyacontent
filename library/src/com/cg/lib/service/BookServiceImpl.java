package com.cg.lib.service;

import java.util.List;

import com.cg.lib.dao.BookDao;
import com.cg.lib.dao.BookDaoImpl;
import com.cg.lib.exception.LibException;
import com.cg.lib.model.Book;

public class BookServiceImpl implements BookService {
	private BookDao bookDao;
	public BookServiceImpl(){
		bookDao=new BookDaoImpl();
	}
	
	public boolean isValidBook(Book book){
		return true;
	}

	@Override
	public void addBook(Book book) throws LibException {
		if(isValidBook(book)){
			bookDao.addBook(book);
		}
		else{
			throw new LibException("Not a valid Book");
		}
		
	}

	@Override
	public void updateBook(Book book) throws LibException {
		// TODO Auto-generated method stub
		if(isValidBook(book)){
			bookDao.updateBook(book);
		}
		else{
			throw new LibException("Not a valid Book");
		}
		
	}

	@Override
	public void deleteBook(int bookCode) throws LibException {
		// TODO Auto-generated method stub
		bookDao.deleteBook(bookCode);
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookCode) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(bookCode);
	}

	@Override
	public List<Book> getAllBooksOrderedByBookCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksOrderedByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksOrderedByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
