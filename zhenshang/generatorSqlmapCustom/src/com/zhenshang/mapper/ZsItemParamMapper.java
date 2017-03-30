package com.zhenshang.mapper;

import com.zhenshang.pojo.ZsItemParam;
import com.zhenshang.pojo.ZsItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsItemParamMapper {
    int countByExample(ZsItemParamExample example);

    int deleteByExample(ZsItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZsItemParam record);

    int insertSelective(ZsItemParam record);

    List<ZsItemParam> selectByExampleWithBLOBs(ZsItemParamExample example);

    List<ZsItemParam> selectByExample(ZsItemParamExample example);

    ZsItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZsItemParam record, @Param("example") ZsItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") ZsItemParam record, @Param("example") ZsItemParamExample example);

    int updateByExample(@Param("record") ZsItemParam record, @Param("example") ZsItemParamExample example);

    int updateByPrimaryKeySelective(ZsItemParam record);

    int updateByPrimaryKeyWithBLOBs(ZsItemParam record);

    int updateByPrimaryKey(ZsItemParam record);
}