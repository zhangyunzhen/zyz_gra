package com.zhenshang.mapper;

import com.zhenshang.pojo.ZsItemCat;
import com.zhenshang.pojo.ZsItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsItemCatMapper {
    int countByExample(ZsItemCatExample example);

    int deleteByExample(ZsItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZsItemCat record);

    int insertSelective(ZsItemCat record);

    List<ZsItemCat> selectByExample(ZsItemCatExample example);

    ZsItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZsItemCat record, @Param("example") ZsItemCatExample example);

    int updateByExample(@Param("record") ZsItemCat record, @Param("example") ZsItemCatExample example);

    int updateByPrimaryKeySelective(ZsItemCat record);

    int updateByPrimaryKey(ZsItemCat record);
}