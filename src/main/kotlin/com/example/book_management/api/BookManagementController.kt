package com.example.book_management.api

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookManagementController() {
    @RequestMapping(value = ["/index"])
    fun index(bookRegisterRequest: BookRegisterRequest, model: Model):String {
        model.addAttribute("bookRegisterRequest", bookRegisterRequest)
        model.addAttribute("message", "Hello Thymeleaf!!")
        return "index"
    }
}