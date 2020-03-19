package com.shicongyuan.signin.attendanceGroup.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shicongyuan.signin.attendanceGroup.mapper.AttendanceGroupMapper;
import com.shicongyuan.signin.attendanceGroup.model.AttendanceGroup;
import com.shicongyuan.signin.attendanceGroup.service.IAttendanceGroupService;
import org.springframework.stereotype.Service;

@Service
public class AttendanceGroupServiceImpl extends ServiceImpl<AttendanceGroupMapper,AttendanceGroup> implements IAttendanceGroupService {
}
