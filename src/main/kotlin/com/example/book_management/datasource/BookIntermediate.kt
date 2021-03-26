package com.example.book_management.datasource

import com.example.book_management.domain.bookInfomation.Author
import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.bookInfomation.BookId
import com.example.book_management.domain.bookInfomation.Contents
import com.example.book_management.domain.bookInfomation.Genre
import com.example.book_management.domain.bookInfomation.Title
import com.example.book_management.domain.bookInfomation.Volume
import com.example.book_management.domain.book_application.BookApplication

class BookIntermediate(var bookId: String) {
    fun create(): BookEntity {
        return BookEntity(
            BookId(bookId),
            BookApplication(
                Genre("a"),
                Title("b"),
                Author("c"),
                Contents("d"),
                Volume(1)
            )
        )
    }
}