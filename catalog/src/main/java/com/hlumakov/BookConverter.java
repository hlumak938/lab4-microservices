package com.hlumakov;

import org.springframework.stereotype.Component;

@Component
public class BookConverter {

    public Book fromDTO(BookDTO bookDTO) {
        if (bookDTO==null) return null;
        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        return book;
    }

    public BookDTO toDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        return bookDTO;
    }
}