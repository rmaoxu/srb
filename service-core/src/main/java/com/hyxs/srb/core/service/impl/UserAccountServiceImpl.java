package com.hyxs.srb.core.service.impl;

import com.hyxs.srb.core.pojo.entity.UserAccount;
import com.hyxs.srb.core.mapper.UserAccountMapper;
import com.hyxs.srb.core.service.IUserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author rmaoxu
 * @since 2021-09-01
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements IUserAccountService {

}
