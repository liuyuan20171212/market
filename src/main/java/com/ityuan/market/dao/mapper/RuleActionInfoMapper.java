package com.ityuan.market.dao.mapper;

import com.ityuan.market.dao.entity.RuleActionInfo;

public interface RuleActionInfoMapper {
    int insert(RuleActionInfo record);

    int insertSelective(RuleActionInfo record);

    RuleActionInfo selectByPrimaryKey(Long actionId);

    int updateByPrimaryKeySelective(RuleActionInfo record);

    int updateByPrimaryKey(RuleActionInfo record);
}