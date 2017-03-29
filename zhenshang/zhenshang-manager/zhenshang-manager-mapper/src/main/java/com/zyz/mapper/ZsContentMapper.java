package com.zyz.mapper;

import com.zyz.pojo.ZsContent;
import com.zyz.pojo.ZsContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsContentMapper {
    int countByExample(ZsContentExample example);

    int deleteByExample(ZsContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZsContent record);

    int insertSelective(ZsContent record);

    List<ZsContent> selectByExampleWithBLOBs(ZsContentExample example);

    List<ZsContent> selectByExample(ZsContentExample example);

    ZsContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZsContent record, @Param("example") ZsContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ZsContent record, @Param("example") ZsContentExample example);

    int updateByExample(@Param("record") ZsContent record, @Param("example") ZsContentExample example);

    int updateByPrimaryKeySelective(ZsContent record);

    int updateByPrimaryKeyWithBLOBs(ZsContent record);

    int updateByPrimaryKey(ZsContent record);
}