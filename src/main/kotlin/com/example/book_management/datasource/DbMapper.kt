package com.example.book_management.datasource

import com.example.book_management.domain.BookTitle
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface DbMapper {
    fun insert(@Param("bookTitle") bookTitle: BookTitle)
}