package com.zyz.mapper;

import com.zyz.pojo.ZsContentCategory;
import com.zyz.pojo.ZsContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsContentCategoryMapper {
    int countByExample(ZsContentCategoryExample example);

    int deleteByExample(ZsContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZsContentCategory record);

    int insertSelective(ZsContentCategory record);

    List<ZsContentCategory> selectByExample(ZsContentCategoryExample example);

    ZsContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZsContentCategory record, @Param("example") ZsContentCategoryExample example);

    int updateByExample(@Param("record") ZsContentCategory record, @Param("example") ZsContentCategoryExample example);

    int updateByPrimaryKeySelective(ZsContentCategory record);

    int updateByPrimaryKey(ZsContentCategory record);
}