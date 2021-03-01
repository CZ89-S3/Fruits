package com.yc.fruit.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.fruit.bean.User;
import com.yc.fruit.bean.UserExample;
import com.yc.fruit.dao.UserMapper;

@Service
public class UserBiz {
    @Resource
	private UserMapper um;
    
public User login(User user) throws BizException {
		
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(user.getUsername())
				.andPasswordEqualTo(user.getPassword());
		List<User> list = um.selectByExample(example);
		if(list.isEmpty()) {
			throw new BizException("用户名或密码错误！");
		}
		return list.get(0);
	}
	
	@Transactional
    public void register(User user) throws Exception {
		UserExample example=new UserExample();
    	example.createCriteria().andUsernameEqualTo(user.getUsername());
    	List<User> list=um.selectByExample(example);
    	if (list.isEmpty()) {
		    um.insertSelective(user);
		}else {
			throw new BizException("该账号已被使用！");
		}
	}

}
