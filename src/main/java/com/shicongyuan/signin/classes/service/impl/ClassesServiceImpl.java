package com.shicongyuan.signin.classes.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shicongyuan.signin.classes.mapper.ClassesMapper;
import com.shicongyuan.signin.classes.model.Classes;
import com.shicongyuan.signin.classes.service.IClassesService;


import org.springframework.stereotype.Service;

@Service
public class ClassesServiceImpl extends ServiceImpl<ClassesMapper, Classes> implements IClassesService{
}
