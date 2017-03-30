package com.zhenshang.mapper;

import com.zhenshang.pojo.ZsUser;
import com.zhenshang.pojo.ZsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsUserMapper {
    int countByExample(ZsUserExample example);

    int deleteByExample(ZsUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZsUser record);

    int insertSelective(ZsUser record);

    List<ZsUser> selectByExample(ZsUserExample example);

    ZsUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZsUser record, @Param("example") ZsUserExample example);

    int updateByExample(@Param("record") ZsUser record, @Param("example") ZsUserExample example);

    int updateByPrimaryKeySelective(ZsUser record);

    int updateByPrimaryKey(ZsUser record);
}