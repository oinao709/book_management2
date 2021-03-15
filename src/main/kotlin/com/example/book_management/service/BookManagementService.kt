package com.example.book_management.service

import com.example.book_management.datasource.BookMapper
import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.bookInfomation.BookId
import com.example.book_management.domain.book_application.BookApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookManagementService {
    @Autowired
    private lateinit var bookMapper: BookMapper

    fun apply(bookApplication: BookApplication): String {
        bookMapper.issue()
        bookMapper.insert(
            BookEntity(
                BookId.create(bookMapper.find()),
                bookApplication
            )
        )
        return bookApplication.title.value
    }
}