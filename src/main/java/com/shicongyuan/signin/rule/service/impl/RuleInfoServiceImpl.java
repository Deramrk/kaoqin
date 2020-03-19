package com.shicongyuan.signin.rule.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shicongyuan.signin.rule.mapper.RuleInfoMapper;
import com.shicongyuan.signin.rule.model.RuleInfo;
import com.shicongyuan.signin.rule.service.IRuleInfoService;
import com.shicongyuan.signin.test.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class RuleInfoServiceImpl extends ServiceImpl<RuleInfoMapper, RuleInfo> implements IRuleInfoService {
}
