package com.example.book_management.datasource.db

import com.example.book_management.domain.bookInfomation.BookEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface BookMapper {
    fun issue()
    fun find(): Int
    fun insert(@Param("book") bookEntity: BookEntity)
}