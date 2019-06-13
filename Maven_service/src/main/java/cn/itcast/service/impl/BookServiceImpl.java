package cn.itcast.service.impl;

import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
  private   BookService dao;
    public Book findById(Integer id) {
       return dao.findById(id);
    }
}
