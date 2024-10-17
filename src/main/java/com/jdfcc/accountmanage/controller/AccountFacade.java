package com.jdfcc.accountmanage.controller;

import com.jdfcc.accountmanage.eneity.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author jdfcc
 * @HomePage <a href="https://github.com/jdfcc">jdfcc</a>
 * @Description AccountController
 * @DateTime 2024/10/16 14:12
 */

@RestController
@RequestMapping("/api/account")
public interface AccountFacade {


    /**
     * obtain account information based on id
     * @param id user id
     * @return account information
     */
    @GetMapping("/act_info_get")
    Account showAccount(@PathParam("id") String id);
}
