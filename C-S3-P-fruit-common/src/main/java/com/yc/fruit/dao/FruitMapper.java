package com.yc.fruit.dao;

import com.yc.fruit.bean.Fruit;
import com.yc.fruit.bean.FruitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FruitMapper {
    long countByExample(FruitExample example);

    int deleteByExample(FruitExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Fruit record);

    int insertSelective(Fruit record);

    List<Fruit> selectByExample(FruitExample example);

    Fruit selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByExample(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByPrimaryKeySelective(Fruit record);

    int updateByPrimaryKey(Fruit record);
}