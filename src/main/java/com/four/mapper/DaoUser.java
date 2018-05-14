package com.four.mapper;

import com.four.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/5/9.
 */
@Mapper
public interface DaoUser {
    @Select("select * from t_user")
    List<User> queryUserInfo();
}
