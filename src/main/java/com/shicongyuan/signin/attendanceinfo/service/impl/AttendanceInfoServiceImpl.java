package com.shicongyuan.signin.attendanceinfo.service.impl;

import com.shicongyuan.signin.attendanceinfo.model.AttendanceInfo;
import com.shicongyuan.signin.attendanceinfo.mapper.AttendanceInfoMapper;
import com.shicongyuan.signin.attendanceinfo.service.IAttendanceInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LXG
 * @since 2020-03-19
 */
@Service
public class AttendanceInfoServiceImpl extends ServiceImpl<AttendanceInfoMapper, AttendanceInfo> implements IAttendanceInfoService {
    @Autowired
    private  AttendanceInfoMapper AttendanceInfoMapper;
    @Override
    public Map<String, List> queryUserAtendandceInfo(String uid) {
        return AttendanceInfoMapper.queryUserAtendandceInfo(uid);
    }
}
