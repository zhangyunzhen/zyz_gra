package com.zyz.mapper;

import com.zyz.pojo.ZsOrderShipping;
import com.zyz.pojo.ZsOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsOrderShippingMapper {
    int countByExample(ZsOrderShippingExample example);

    int deleteByExample(ZsOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ZsOrderShipping record);

    int insertSelective(ZsOrderShipping record);

    List<ZsOrderShipping> selectByExample(ZsOrderShippingExample example);

    ZsOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ZsOrderShipping record, @Param("example") ZsOrderShippingExample example);

    int updateByExample(@Param("record") ZsOrderShipping record, @Param("example") ZsOrderShippingExample example);

    int updateByPrimaryKeySelective(ZsOrderShipping record);

    int updateByPrimaryKey(ZsOrderShipping record);
}