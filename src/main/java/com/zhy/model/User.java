package com.zhy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: zhangocean
 * @Date: 2018/6/4 11:49
 * Describe: 用户实体类
 */
@Data
@NoArgsConstructor
public class User {

    private int id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private String gender;

    /**
     * 真实姓名
     */
    private String trueName;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 个人简介
     */
    private String personalBrief;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 最后登录时间
     */
    private String recentlyLanded;

    /**
     * 头像地址
     */
    private String avatarImgUrl;

    private List<Role> roles;

    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String phone, String username, String password, String gender, String trueName, String birthday,
			String personalBrief, String email, String recentlyLanded, String avatarImgUrl, List<Role> roles) {
		super();
		this.id = id;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.trueName = trueName;
		this.birthday = birthday;
		this.personalBrief = personalBrief;
		this.email = email;
		this.recentlyLanded = recentlyLanded;
		this.avatarImgUrl = avatarImgUrl;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPersonalBrief() {
		return personalBrief;
	}

	public void setPersonalBrief(String personalBrief) {
		this.personalBrief = personalBrief;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRecentlyLanded() {
		return recentlyLanded;
	}

	public void setRecentlyLanded(String recentlyLanded) {
		this.recentlyLanded = recentlyLanded;
	}

	public String getAvatarImgUrl() {
		return avatarImgUrl;
	}

	public void setAvatarImgUrl(String avatarImgUrl) {
		this.avatarImgUrl = avatarImgUrl;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public User(String phone, String username, String password, String gender) {
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public User(String phone, String username, String password, String gender, String trueName, String birthday, String personalBrief, String email, String recentlyLanded, String avatarImgUrl) {
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.trueName = trueName;
        this.birthday = birthday;
        this.personalBrief = personalBrief;
        this.email = email;
        this.recentlyLanded = recentlyLanded;
        this.avatarImgUrl = avatarImgUrl;
    }
}
