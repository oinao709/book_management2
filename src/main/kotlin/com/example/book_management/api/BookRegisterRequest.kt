package com.example.book_management.api

import com.example.book_management.domain.BookTitle

class BookRegisterRequest(var bookTitle: String) {

    fun create(): BookTitle {
        return BookTitle(bookTitle)
    }
}