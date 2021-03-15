package com.example.book_management.domain.bookInfomation

class BookId(var value: String) {
    companion object {
        fun create(num: Int) = BookId(num.toString().padStart(10,'0'))
    }
}