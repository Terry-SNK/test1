package cn.itcast.dao;

import cn.itcast.domian.Book;

public interface BookDao {
    Book findById(Integer id);
}
