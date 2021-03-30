package com.example.book_management.datasource

import com.example.book_management.domain.bookInfomation.Author
import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.bookInfomation.BookId
import com.example.book_management.domain.bookInfomation.Contents
import com.example.book_management.domain.bookInfomation.Genre
import com.example.book_management.domain.bookInfomation.Title
import com.example.book_management.domain.bookInfomation.Volume
import com.example.book_management.domain.book_application.BookApplication

class BookIntermediate(
    var bookId: String,
    var genre: String,
    var title: String,
    var author: String,
    var contents: String) {
    fun create(): BookEntity {
        return BookEntity(
            BookId(bookId),
            BookApplication(
                Genre(genre),
                Title(title),
                Author(author),
                Contents(contents),
                Volume(1)
            )
        )
    }
}