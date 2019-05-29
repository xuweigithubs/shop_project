package com.huawei.dao;

import com.huawei.vo.usertable;
import com.huawei.vo.UsertableCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsertableMapper {

    int countByCondition(UsertableCondition condition);

    int deleteByCondition(UsertableCondition condition);

    int insert(usertable record);

    int insertSelective(usertable record);

    List<usertable> selectByCondition(UsertableCondition condition);

    int updateByConditionSelective(@Param("record") usertable record, @Param("condition") UsertableCondition condition);

    int updateByCondition(@Param("record") usertable record, @Param("condition") UsertableCondition condition);
}