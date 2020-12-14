package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kxj
 * @create  2020-11-25 19:21
 */
@Service
@Scope("prototype")
public class IBookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    public int deleteByPrimaryKey(Integer bookId) {
        return 0;
    }

    public int insert(Book record) {
        bookMapper.insert(record);
        return 0;
    }

    public int insertSelective(Book record) {
        return 0;
    }

    public Book selectByPrimaryKey(Integer bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    public Book updateByPrimaryKey(Book record) {
        bookMapper.updateByPrimaryKey(record);
        return record;
    }

    public List queryAll(Book record) {

        return bookMapper.queryAll(record);
    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
