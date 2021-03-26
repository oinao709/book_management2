package com.example.book_management.api.register

import com.example.book_management.service.register.BookManagementRegisterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*

@Controller
class BookRegisterApi {
    @Autowired
    private lateinit var registerService: BookManagementRegisterService

    @RequestMapping(value = ["/book/register"])
    fun register(@ModelAttribute bookRegisterRequest: BookRegisterRequest, model : Model): String {
        val aa = registerService.apply(bookRegisterRequest.create())

        val res: MutableMap<String, String> = HashMap()
        res["response"] = aa + "の登録が完了しました。"
        model.addAttribute("res", res)
        return "book/register"
    }
}