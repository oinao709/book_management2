package com.example.book_management.domain.bookInfomation

import com.example.book_management.domain.book_application.BookApplication

class BookEntity(
    var bookId: BookId,
    var bookApplication: BookApplication
) {
}