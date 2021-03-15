package com.example.book_management.domain.book_application

import com.example.book_management.domain.bookInfomation.Author
import com.example.book_management.domain.bookInfomation.Contents
import com.example.book_management.domain.bookInfomation.Genre
import com.example.book_management.domain.bookInfomation.Title
import com.example.book_management.domain.bookInfomation.Volume

class BookApplication(
    var genre: Genre,
    var title: Title,
    var author: Author,
    var contents: Contents,
    var volume: Volume
) {
}