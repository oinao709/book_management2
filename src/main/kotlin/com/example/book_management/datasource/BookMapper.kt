package com.example.book_management.datasource

import com.example.book_management.domain.book_application.BookApplication
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface BookMapper {
    fun insert(@Param("book") bookApplication: BookApplication)
}