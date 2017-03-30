package com.zhenshang.mapper;

import com.zhenshang.pojo.ZsOrderItem;
import com.zhenshang.pojo.ZsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsOrderItemMapper {
    int countByExample(ZsOrderItemExample example);

    int deleteByExample(ZsOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZsOrderItem record);

    int insertSelective(ZsOrderItem record);

    List<ZsOrderItem> selectByExample(ZsOrderItemExample example);

    ZsOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZsOrderItem record, @Param("example") ZsOrderItemExample example);

    int updateByExample(@Param("record") ZsOrderItem record, @Param("example") ZsOrderItemExample example);

    int updateByPrimaryKeySelective(ZsOrderItem record);

    int updateByPrimaryKey(ZsOrderItem record);
}