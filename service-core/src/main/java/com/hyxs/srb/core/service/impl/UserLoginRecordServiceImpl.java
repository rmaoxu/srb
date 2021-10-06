package com.hyxs.srb.core.service.impl;

import com.hyxs.srb.core.pojo.entity.UserLoginRecord;
import com.hyxs.srb.core.mapper.UserLoginRecordMapper;
import com.hyxs.srb.core.service.IUserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author rmaoxu
 * @since 2021-09-01
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements IUserLoginRecordService {

}
