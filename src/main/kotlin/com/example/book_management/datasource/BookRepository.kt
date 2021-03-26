package com.example.book_management.datasource

import com.example.book_management.datasource.db.BookMapper
import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.bookInfomation.BookId
import com.example.book_management.domain.book_register.IBookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class BookRepository : IBookRepository {
    @Autowired
    private lateinit var bookMapper: BookMapper

    override fun getBookId(): BookId {
        return BookId.create(bookMapper.issue())
    }

    override fun save(bookEntity: BookEntity) {
        bookMapper.insert(bookEntity)
    }

    override fun findBy(bookId: BookId): BookEntity {
        return bookMapper.find(bookId).create()
    }
}
