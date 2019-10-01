package com.cg.lib.service;

import java.util.List;

import com.cg.lib.exception.LibException;
import com.cg.lib.model.Book;

public interface BookService {
	void addBook(Book book) throws LibException;
	void updateBook(Book book) throws LibException;
	void deleteBook(int bookCode) throws LibException;
	List<Book> getAllBooks();
	Book getBookById(int bookCode);
	List<Book> getAllBooksOrderedByBookCode();
	List<Book> getAllBooksOrderedByTitle();
	List<Book> getAllBooksOrderedByPrice();
	
}
