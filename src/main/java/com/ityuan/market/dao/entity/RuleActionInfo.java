package com.ityuan.market.dao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RuleActionInfo {
    private Long actionId;

    private Integer actionType;

    private String actionName;

    private String actionDesc;

    private String actionClass;

    private Integer isEffect;

    private Long creUserId;

    private Date creTime;

    private String remark;
}