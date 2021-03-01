package com.yc.fruit.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.yc.fruit.bean.FruitExample;
import com.yc.fruit.dao.FruitMapper;


@RestController
public class FruitAction {
    @Resource
	private FruitMapper fm;
    
    @GetMapping("fruitsN")
	public List<?> queryNew(){
		FruitExample fe = new FruitExample();
		fe.setOrderByClause("fdate");
		PageHelper.startPage(1, 8);
		return fm.selectByExample(fe);
	}
    
    @GetMapping("fruitsP")
   	public List<?> queryPopular(){
   		FruitExample fe = new FruitExample();
   		fe.createCriteria().andHotEqualTo(1);
   		PageHelper.startPage(1, 8);
   		return fm.selectByExample(fe);
   	}
    
    @GetMapping("fruitsG")
   	public List<?> queryGuanggao(){
   		FruitExample fe = new FruitExample();
   		fe.createCriteria().andGuanggaoEqualTo(1);
   		PageHelper.startPage(1, 1);
   		return fm.selectByExample(fe);
   	}
    
    @GetMapping("fruitsT")
   	public List<?> queryTuijian(){
    	FruitExample fe = new FruitExample();
		fe.setOrderByClause("(fnprice-fprice)/fprice");
		PageHelper.startPage(1, 1);
		return fm.selectByExample(fe);
   	}
    
    
	
}
