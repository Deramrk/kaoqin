package com.shicongyuan.signin.backPay.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shicongyuan.signin.backPay.mapper.BackPayMapper;
import com.shicongyuan.signin.backPay.model.BackPay;
import com.shicongyuan.signin.backPay.service.IBackPayService;
import org.springframework.stereotype.Service;

@Service
public class BackPayServiceIpml extends ServiceImpl<BackPayMapper,BackPay> implements IBackPayService {
}
