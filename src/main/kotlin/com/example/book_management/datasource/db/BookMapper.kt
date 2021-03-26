package com.example.book_management.datasource.db

import com.example.book_management.datasource.BookIntermediate
import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.bookInfomation.BookId
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface BookMapper {
    fun issue(): Int
    fun insert(@Param("book") bookEntity: BookEntity)
    fun find(@Param("bookId") bookId : BookId) : BookIntermediate
}