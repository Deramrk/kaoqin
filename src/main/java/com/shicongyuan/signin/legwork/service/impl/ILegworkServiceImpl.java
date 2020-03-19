package com.shicongyuan.signin.legwork.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shicongyuan.signin.legwork.mapper.LegworkMapper;
import com.shicongyuan.signin.legwork.model.Legwork;
import com.shicongyuan.signin.legwork.service.ILegworkService;
import org.springframework.stereotype.Service;

@Service
public class ILegworkServiceImpl extends ServiceImpl<LegworkMapper,Legwork> implements ILegworkService{
}
