package com.example.librarybooks.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarybooks.exception.ResourceNotFoundException;
import com.example.librarybooks.model.Book;
import com.example.librarybooks.repository.BookRepository;

@RestController
public class BookController {
	
	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		List<Book> allBooks = bookRepository.findAll();
		return allBooks;
	}

	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable(value = "id") Integer bookId) throws ResourceNotFoundException {
		Book book = bookRepository.findById(bookId).orElseThrow(() -> new ResourceNotFoundException("No book found with this id: " + bookId.toString()));
		return ResponseEntity.ok().body(book);
	}

	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}

	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable(value = "id") Integer bookId, @RequestBody Book bookInfo) throws ResourceNotFoundException {
		Book targetBook = bookRepository.findById(bookId).orElseThrow(() -> new ResourceNotFoundException("No book found with this id: " + bookId.toString()));

		targetBook.setTitle(bookInfo.getTitle());
		targetBook.setAuthor(bookInfo.getAuthor());
		targetBook.setLanguage(bookInfo.getLanguage());
		Book updatedBook = bookRepository.save(targetBook);
		return ResponseEntity.ok().body(updatedBook);
	}

	@DeleteMapping("/books/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteBook(@PathVariable(value = "id") Integer bookId) throws ResourceNotFoundException {
		bookRepository.findById(bookId).orElseThrow(() -> new ResourceNotFoundException("No book found with this id: " + bookId.toString()));
		bookRepository.deleteById(bookId);
	}

}

