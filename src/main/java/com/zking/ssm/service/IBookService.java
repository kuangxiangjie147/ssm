package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kxj
 * @create  2020-11-25 19:14
 */
@Transactional
public interface IBookService {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);
    @Transactional(readOnly = true)
//    @Cacheable(value = "book")
    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);
//    @CachePut(value = "book" )
    Book updateByPrimaryKey(Book record);
    @Transactional(readOnly = true)
    List queryAll(Book record);
}
