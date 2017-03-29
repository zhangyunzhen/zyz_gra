package com.zyz.mapper;

import com.zyz.pojo.ZsItemDesc;
import com.zyz.pojo.ZsItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsItemDescMapper {
    int countByExample(ZsItemDescExample example);

    int deleteByExample(ZsItemDescExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(ZsItemDesc record);

    int insertSelective(ZsItemDesc record);

    List<ZsItemDesc> selectByExampleWithBLOBs(ZsItemDescExample example);

    List<ZsItemDesc> selectByExample(ZsItemDescExample example);

    ZsItemDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") ZsItemDesc record, @Param("example") ZsItemDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ZsItemDesc record, @Param("example") ZsItemDescExample example);

    int updateByExample(@Param("record") ZsItemDesc record, @Param("example") ZsItemDescExample example);

    int updateByPrimaryKeySelective(ZsItemDesc record);

    int updateByPrimaryKeyWithBLOBs(ZsItemDesc record);

    int updateByPrimaryKey(ZsItemDesc record);
}