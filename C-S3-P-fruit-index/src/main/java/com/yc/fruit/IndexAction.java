package com.yc.fruit;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.fruit.bean.Result;
import com.yc.fruit.bean.User;
import com.yc.fruit.web.remote.IFruitAction;
import com.yc.fruit.web.remote.IUserAction;




@RestController
public class IndexAction {

		
		@Resource
		private IUserAction iua;
		@Resource
		private IFruitAction ifa;

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
		
		@RequestMapping("fruitsN")
		public List<?> queryNew() {
			return ifa.queryNew();
		}
		
		@RequestMapping("fruitsP")
		public List<?> queryPopular() {
			return ifa.queryPopular();
		}
		
		@RequestMapping("fruitsG")
		public List<?> queryGuanggao() {
			return ifa.queryGuanggao();
		}
		
		@RequestMapping("fruitsT")
		public List<?> queryTuijian() {
			return ifa.queryTuijian();
		}

	}


