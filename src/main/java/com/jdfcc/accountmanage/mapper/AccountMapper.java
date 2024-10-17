package com.jdfcc.accountmanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdfcc.accountmanage.eneity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jdfcc
 * @HomePage <a href="https://github.com/jdfcc">jdfcc</a>
 * @Description AccountMapper
 * @DateTime 2024/10/16 16:45
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
