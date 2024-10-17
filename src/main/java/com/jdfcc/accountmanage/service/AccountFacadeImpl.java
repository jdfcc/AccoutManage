package com.jdfcc.accountmanage.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jdfcc.accountmanage.controller.AccountFacade;
import com.jdfcc.accountmanage.eneity.Account;
import com.jdfcc.accountmanage.mapper.AccountMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author jdfcc
 * @HomePage <a href="https://github.com/jdfcc">jdfcc</a>
 * @Description AccountFacadeImpl
 * @DateTime 2024/10/16 16:55
 */
@Component
public class AccountFacadeImpl implements AccountFacade {

    @Resource
    private AccountMapper accountMapper;


    @Override
    public Account showAccount(String id) {

        Account account = new Account();
        account.setId("12345");
        account.setName("John");
        account.setGender("Male");
        accountMapper.insert(account);
        return accountMapper.selectById("12345");

    }
}
