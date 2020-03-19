package com.shicongyuan.signin.attendanceinfo.service;

import com.shicongyuan.signin.attendanceinfo.model.AttendanceInfo;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LXG
 * @since 2020-03-19
 */
public interface IAttendanceInfoService extends IService<AttendanceInfo> {
    Map<String,List> queryUserAtendandceInfo(String uid);
}
