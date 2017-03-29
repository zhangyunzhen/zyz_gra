package com.zyz.mapper;

import com.zyz.pojo.ZsItemParam;
import com.zyz.pojo.ZsItemParamExample;
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