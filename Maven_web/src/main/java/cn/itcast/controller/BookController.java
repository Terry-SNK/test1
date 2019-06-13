package cn.itcast.controller;

import cn.itcast.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;

@Controller
@RequestMapping
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping
    public String findBy(Model model){
        Book book = bookService.findById(1);
        model.addAttribute("book",book);
        return "itemDetail";
    }
}
