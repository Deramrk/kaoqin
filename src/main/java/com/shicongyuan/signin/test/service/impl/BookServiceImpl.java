package com.shicongyuan.signin.test.service.impl;

import com.shicongyuan.signin.test.model.Book;
import com.shicongyuan.signin.test.mapper.BookMapper;
import com.shicongyuan.signin.test.service.IBookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LXG
 * @since 2020-03-14
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
