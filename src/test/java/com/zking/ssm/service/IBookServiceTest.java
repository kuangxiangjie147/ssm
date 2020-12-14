package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kxj
 * @create  2020-11-25 19:32
 */
public class IBookServiceTest extends BaseTestCase{
    @Autowired
    private IBookService iBookService;
    Book book;
//    private SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        book =new Book();
//        sqlSession = MybatisSessionFactoryUtils.openSession();
//        //com.zking.ssm.mapper.BookMapper
//        //String name = BookMapper.class.getName();
//        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
//        IBookServiceImpl bookServiceImpl= new IBookServiceImpl();
//        bookServiceImpl.setBookMapper(bookMapper);
//        iBookService = bookServiceImpl;
    }

    @After
    public void tearDown() throws Exception {
//        sqlSession.commit();
    }

    @Test
    public void insert() {
        book.setBookId(null);
        book.setBookName("西游记2");
        book.setBookPrice(33f);
        book.setBookBrief("阿斯蒂芬");
        iBookService.insert(book);
        System.out.println("OK");
    }

    @Test
    public void queryAll() {
        book.setBookName("西");
        List list = iBookService.queryAll(book);
        list.forEach(l -> System.out.println(l)

        );

    }
    @Test
    public void get(){
        System.out.println("ppppppppppp");
        Book b = iBookService.selectByPrimaryKey(1);
        System.out.println(b);
        System.out.println("nnnnnnnnnnn");
        Book b1 = iBookService.selectByPrimaryKey(1);
        System.out.println(b1);
    }
    @Test
    public void edit(){
        book.setBookId(2);
        book.setBookName("西游记");
        book.setBookPrice(44f);
        book.setBookBrief("aaaaaa阿斯蒂芬");
        iBookService.updateByPrimaryKey(book);

    }

}