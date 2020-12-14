package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author kxj
 * @create  2020-11-30 18:34
 */
@Controller
@RequestMapping("/book")
public class HelloController {
    @Autowired
    private IBookService iBookService;
    @ModelAttribute
    public void getBook(Model model){
        Book b = iBookService.selectByPrimaryKey(1);
        model.addAttribute("book",b);
    }
    @RequestMapping("/hello")
    public String hello(String name, HttpServletRequest request){
        System.out.println(name);
        request.setAttribute("username",name);
        return "Login";
    }

    @RequestMapping("/toTop")
    public String toTop(){
        System.out.println(1111111);
        return "Top";
    }
    @RequestMapping("/{language}")
    public String change(@PathVariable String language, HttpSession session, HttpServletRequest request){
        if ("zh".equals(language)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }else if("en".equals(language)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        }else{
            throw new RuntimeException("不支持的语言["+language+"]");
        }
        return "Top";
    }
}
