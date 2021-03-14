package com.example.book_management.api

import com.example.book_management.service.BookManagementService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class BookRegisterApi {
    @Autowired
    private lateinit var service: BookManagementService

    @RequestMapping(value = ["/book/register"])
    fun register(@ModelAttribute bookRegisterRequest: BookRegisterRequest): String {
        val aa = service.get(bookRegisterRequest.create())

        val res: MutableMap<String, String> = HashMap()
        res["response"] = aa + "の登録が完了しました。"
        return "book/register"
    }

//    fun register(@ModelAttribute bookRegisterRequest: BookRegisterRequest): String {
//        val aa = service.get(bookRegisterRequest.create())
//        println(aa)
//        val res: MutableMap<String, String> = HashMap()
//        res["response"] = aa + "の登録が完了しました。"
//        return "book/register"
//    }
}