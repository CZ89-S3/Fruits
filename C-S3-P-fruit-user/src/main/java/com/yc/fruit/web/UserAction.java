package com.yc.fruit.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.fruit.bean.Result;
import com.yc.fruit.bean.User;
import com.yc.fruit.biz.BizException;
import com.yc.fruit.biz.UserBiz;

@RestController
public class UserAction {
    @Resource
	private UserBiz ub;
    
    @RequestMapping("login")
	public Result login(@Valid @RequestBody User user,Errors errors,HttpSession session) {
		 try {
			 if(errors.hasFieldErrors("username")||errors.hasFieldErrors("password")) {
				 return Result.failure("字段验证错误", errors.getAllErrors());
			 }
			User ret = ub.login(user);
			session.setAttribute("loginedUser", ret);
			// 登录成功之后，将用户对象发送给调用中
			return Result.success("登录成功", ret);
		} catch (BizException e) {
			e.printStackTrace();
			return Result.failure(e.getMessage(), null);
		}
	}
	
	@RequestMapping("regist")
	public Result regist(@Valid @RequestBody User user, Errors errors) {
		
		if (errors.hasFieldErrors("username") ||errors.hasFieldErrors("phone") || errors.hasFieldErrors("name") 
				|| errors.hasFieldErrors("password")||errors.hasFieldErrors("email") ) {
			return Result.failure("字段验证错误！", errors.getAllErrors());
		}
		try {
			ub.register(user);
			return Result.success("注册成功！", null);
		} catch (Exception e) {
			errors.rejectValue("name", "NotOne", e.getMessage());
			return Result.failure("字段验证错误", errors.getAllErrors());
		}

	}
	
}
