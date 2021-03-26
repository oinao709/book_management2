package com.example.book_management.api

import com.example.book_management.domain.bookInfomation.BookEntity
import com.example.book_management.domain.bookInfomation.BookId
import com.example.book_management.service.refer.BookManagementReferService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*

@Controller
class BookReferApi {
    @Autowired
    private lateinit var referService: BookManagementReferService
            @RequestMapping(value = ["/book/refer"])
    fun refer(model: Model): String {
        val bookEntity: BookEntity = referService.refer(BookId("0000000001"))
        val res: MutableMap<String, String> = HashMap()
        res["response"] = "ok"
        res["book_id"] = bookEntity.bookId.value
        model.addAttribute("res", res)
        return "book/refer"
    }
}