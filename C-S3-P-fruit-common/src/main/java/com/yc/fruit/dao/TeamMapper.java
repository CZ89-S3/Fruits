package com.yc.fruit.dao;

import com.yc.fruit.bean.Team;
import com.yc.fruit.bean.TeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}