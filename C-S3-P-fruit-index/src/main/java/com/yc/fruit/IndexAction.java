package com.yc.fruit;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.fruit.bean.Result;
import com.yc.fruit.bean.User;
import com.yc.fruit.web.remote.IUserAction;




@RestController
public class IndexAction {

		
		@Resource
		private IUserAction iua;

		@RequestMapping("login")
		public Result login(User user, HttpSession session) {
			Result ret = iua.login(user);
			if (ret.getCode() == 1) {
				session.setAttribute("loginedUser", ret.getData());
			}
			return ret;
		}
		
		@RequestMapping("getLoginedUser")
		public Result getLoginedUser(HttpSession session) {
			return Result.success("会话中的用户对象", session.getAttribute("loginedUser"));
		}
		
		@RequestMapping("regist")
	   	public Result regist(User user) {
	    	Result ret=iua.regist(user);
			return ret;
	   	}

	}


