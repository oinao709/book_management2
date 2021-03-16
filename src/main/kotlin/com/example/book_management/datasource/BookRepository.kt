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
        bookMapper.issue()
        return BookId.create(bookMapper.find())
    }

    override fun save(bookEntity: BookEntity) {
        bookMapper.insert(bookEntity)
    }
}
