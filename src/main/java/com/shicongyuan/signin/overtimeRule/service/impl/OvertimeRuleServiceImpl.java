package com.shicongyuan.signin.overtimeRule.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shicongyuan.signin.overtimeRule.mapper.OvertimeRuleMapper;
import com.shicongyuan.signin.overtimeRule.model.OvertimeRule;
import com.shicongyuan.signin.overtimeRule.service.IOvertimeRuleService;
import org.springframework.stereotype.Service;

@Service
public class OvertimeRuleServiceImpl extends ServiceImpl<OvertimeRuleMapper,OvertimeRule> implements IOvertimeRuleService {
}
