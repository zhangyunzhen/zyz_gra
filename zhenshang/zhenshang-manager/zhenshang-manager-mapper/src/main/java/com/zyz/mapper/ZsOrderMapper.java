package com.zyz.mapper;

import com.zyz.pojo.ZsOrder;
import com.zyz.pojo.ZsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsOrderMapper {
    int countByExample(ZsOrderExample example);

    int deleteByExample(ZsOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ZsOrder record);

    int insertSelective(ZsOrder record);

    List<ZsOrder> selectByExample(ZsOrderExample example);

    ZsOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ZsOrder record, @Param("example") ZsOrderExample example);

    int updateByExample(@Param("record") ZsOrder record, @Param("example") ZsOrderExample example);

    int updateByPrimaryKeySelective(ZsOrder record);

    int updateByPrimaryKey(ZsOrder record);
}