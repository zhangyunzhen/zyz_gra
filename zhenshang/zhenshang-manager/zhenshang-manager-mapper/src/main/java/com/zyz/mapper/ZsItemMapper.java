package com.zyz.mapper;

import com.zyz.pojo.ZsItem;
import com.zyz.pojo.ZsItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsItemMapper {
    int countByExample(ZsItemExample example);

    int deleteByExample(ZsItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZsItem record);

    int insertSelective(ZsItem record);

    List<ZsItem> selectByExample(ZsItemExample example);

    ZsItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZsItem record, @Param("example") ZsItemExample example);

    int updateByExample(@Param("record") ZsItem record, @Param("example") ZsItemExample example);

    int updateByPrimaryKeySelective(ZsItem record);

    int updateByPrimaryKey(ZsItem record);
}