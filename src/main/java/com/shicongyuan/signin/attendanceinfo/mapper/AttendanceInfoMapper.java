package com.shicongyuan.signin.attendanceinfo.mapper;

import com.shicongyuan.signin.attendanceinfo.model.AttendanceInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LXG
 * @since 2020-03-19
 */
public interface AttendanceInfoMapper extends BaseMapper<AttendanceInfo> {
@Select("select * from user_info ui ,`attendance_info` ai where  ui.id=ai.uid and ai.uid=#{uid}")
Map<String,List> queryUserAtendandceInfo(String uid);

}
