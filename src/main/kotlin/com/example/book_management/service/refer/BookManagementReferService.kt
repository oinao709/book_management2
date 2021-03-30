package com.example.book_management.service.refer

import com.example.book_management.datasource.BookRepository
import com.example.book_management.domain.bookInfomation.BookEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookManagementReferService {
    @Autowired
    private lateinit var bookRepository: BookRepository

    fun refer(): List<BookEntity> {
        return bookRepository.findAll()
    }
}