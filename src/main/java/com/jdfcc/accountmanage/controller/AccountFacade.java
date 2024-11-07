package com.jdfcc.accountmanage.controller;

import com.jdfcc.accountmanage.eneity.Account;
import org.springframework.web.bind.annotation.*;

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
     * @return account information
     */
    @PostMapping("/act_info_get")
    Account showAccount(@RequestBody Account account);
}







