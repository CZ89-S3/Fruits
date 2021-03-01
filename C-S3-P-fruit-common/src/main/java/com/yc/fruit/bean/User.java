package com.yc.fruit.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class User implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer uid;
    @NotNull(message = "用户名不能为空！")
	@NotEmpty(message = "用户名不能为空！")
    private String username;
    
    @Length(min = 6, max = 16, message = "密码长度必须是6-16位")
	@NotEmpty(message = "密码不能为空！")
    private String password;
    
    @NotNull(message = "姓名不能为空！")
	@NotEmpty(message = "姓名不能为空！")
    private String name;
    
    @Email(message = "邮箱地址格式错误")
	@NotEmpty(message = "邮箱不能为空")
    private String email;
    
    @Pattern(regexp = "1\\d{10}", message = "电话号码必须是1开头的11位数字")
    private String phone;

    private String sex;

    private String addr;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }
}