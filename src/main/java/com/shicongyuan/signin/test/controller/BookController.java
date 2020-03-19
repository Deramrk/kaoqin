package com.shicongyuan.signin.test.controller;


import com.shicongyuan.signin.test.model.Book;
import com.shicongyuan.signin.test.service.IBookService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LXG
 * @since 2020-03-14
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @ApiOperation(value = "查询单个",notes = "备注：现在数据库里面没有数据啊")
    @ApiImplicitParam(name = "id",value = "书本编号",dataType = "int",paramType = "query",required = true)
    @ResponseBody
    @RequestMapping(value = "/querySingleBook",method = RequestMethod.POST)
    public Book querySingleBook(int id){
        Book book = iBookService.selectById(id);
        return book;
    }
}

