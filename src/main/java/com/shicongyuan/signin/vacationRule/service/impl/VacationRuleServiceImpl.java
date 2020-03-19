package com.shicongyuan.signin.vacationRule.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shicongyuan.signin.vacationRule.mapper.VacationRuleMapper;
import com.shicongyuan.signin.vacationRule.model.VacationRule;
import com.shicongyuan.signin.vacationRule.service.IVacationRuleService;
import org.springframework.stereotype.Service;

@Service
public class VacationRuleServiceImpl extends ServiceImpl<VacationRuleMapper,VacationRule> implements IVacationRuleService {
}
