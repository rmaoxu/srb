package com.hyxs.srb.core.service.impl;

import com.hyxs.srb.core.pojo.entity.UserInfo;
import com.hyxs.srb.core.mapper.UserInfoMapper;
import com.hyxs.srb.core.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author rmaoxu
 * @since 2021-09-01
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
