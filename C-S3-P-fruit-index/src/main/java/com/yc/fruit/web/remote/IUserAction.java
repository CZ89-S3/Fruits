package com.yc.fruit.web.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.yc.fruit.bean.Result;
import com.yc.fruit.bean.User;



@FeignClient("fruit-user")
public interface IUserAction {

	@PostMapping("login")
	Result login(User user);
	
	@PostMapping("regist")
	Result regist(User user);
	
}
