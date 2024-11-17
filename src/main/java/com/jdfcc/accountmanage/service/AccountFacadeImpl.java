package com.jdfcc.accountmanage.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jdfcc.accountmanage.controller.AccountFacade;
import com.jdfcc.accountmanage.eneity.Account;
import com.jdfcc.accountmanage.eneity.Result;
import com.jdfcc.accountmanage.mapper.AccountMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

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
    public Result addAccount(Account account) {
        account.setId(String.valueOf(UUID.randomUUID()));
        accountMapper.insert(account);
        return Result.success();
    }

    @Override
    public Result getAccount(String id) {
        return Result.success(accountMapper.selectById(id));
    }

    @Override
    public Result updateAccount(Account account) {
        LambdaQueryWrapper<Account> accountLambdaQueryWrapper = new LambdaQueryWrapper<>();
        accountLambdaQueryWrapper.eq(Account::getId, account.getId());
        accountMapper.update(account, accountLambdaQueryWrapper);
        return Result.success();
    }

    @Override
    public Result deleteAccount(String id) {
        accountMapper.deleteById(id);
        return Result.success();
    }
}








