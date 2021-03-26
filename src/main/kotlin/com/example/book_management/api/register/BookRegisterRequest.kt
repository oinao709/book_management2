package com.example.book_management.api.register

import com.example.book_management.domain.bookInfomation.Author
import com.example.book_management.domain.bookInfomation.Contents
import com.example.book_management.domain.bookInfomation.Genre
import com.example.book_management.domain.bookInfomation.Title
import com.example.book_management.domain.bookInfomation.Volume
import com.example.book_management.domain.book_application.BookApplication

class BookRegisterRequest(
    var genre: String,
    var title: String,
    var author: String,
    var contents: String,
    var volume: Int
) {

    fun create(): BookApplication {
        return BookApplication(
            Genre(genre),
            Title(title),
            Author(author),
            Contents(contents),
            Volume(volume)
        )
    }
}