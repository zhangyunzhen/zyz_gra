package com.zyz.mapper;

import com.zyz.pojo.ZsItemParamItem;
import com.zyz.pojo.ZsItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsItemParamItemMapper {
    int countByExample(ZsItemParamItemExample example);

    int deleteByExample(ZsItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZsItemParamItem record);

    int insertSelective(ZsItemParamItem record);

    List<ZsItemParamItem> selectByExampleWithBLOBs(ZsItemParamItemExample example);

    List<ZsItemParamItem> selectByExample(ZsItemParamItemExample example);

    ZsItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZsItemParamItem record, @Param("example") ZsItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ZsItemParamItem record, @Param("example") ZsItemParamItemExample example);

    int updateByExample(@Param("record") ZsItemParamItem record, @Param("example") ZsItemParamItemExample example);

    int updateByPrimaryKeySelective(ZsItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(ZsItemParamItem record);

    int updateByPrimaryKey(ZsItemParamItem record);
}