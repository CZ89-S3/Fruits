package com.yc.fruit.web.remote;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("fruit-fruits")
public interface IFruitAction {
	
	@GetMapping("fruitsN")
	List<?> queryNew();
	
	@GetMapping("fruitsP")
	List<?> queryPopular();
	
	@GetMapping("fruitsG")
	List<?> queryGuanggao();
	
	@GetMapping("fruitsT")
	List<?> queryTuijian();
}
