package com.jd.feima.dao;

import com.jd.feima.domain.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
}