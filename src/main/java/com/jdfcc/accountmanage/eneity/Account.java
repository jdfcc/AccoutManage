package com.jdfcc.accountmanage.eneity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author jdfcc
 * @HomePage <a href="https://github.com/jdfcc">jdfcc</a>
 * @Description Account entity
 * @DateTime 2024/10/16 13:34
 */
@Data
@TableName("account")
public class Account implements Serializable {
    /**
     *
     */
    private String id;
    private String name;
    private String gender;
}





