package com.example.book_management.domain.book_register

import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.bookInfomation.BookId

interface IBookRepository {
    fun getBookId() : BookId
    fun save(bookEntity: BookEntity)
}