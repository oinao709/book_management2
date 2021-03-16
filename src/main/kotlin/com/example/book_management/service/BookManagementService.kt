package com.example.book_management.service

import com.example.book_management.datasource.BookRepository
import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.book_application.BookApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookManagementService {
    @Autowired
    private lateinit var bookRepository: BookRepository

    fun apply(bookApplication: BookApplication): String {
        bookRepository.save(
            BookEntity(
                bookRepository.getBookId(),
                bookApplication
            )
        )
        return bookApplication.title.value
    }
}