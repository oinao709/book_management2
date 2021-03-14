package com.example.book_management.service

import com.example.book_management.datasource.DbMapper
import com.example.book_management.domain.Book
import com.example.book_management.domain.BookTitle
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookManagementService {
    @Autowired
    private lateinit var dbMapper: DbMapper

    fun get(bookTitle: BookTitle): String {
        val book = Book(bookTitle)
        dbMapper.insert(bookTitle)
        return book.bookTitle.value
    }
}