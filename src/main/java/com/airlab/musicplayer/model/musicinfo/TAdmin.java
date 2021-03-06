package com.airlab.musicplayer.model.musicinfo;

import com.airlab.musicplayer.model.BaseModel;
import com.airlab.musicplayer.model.IIdAware;

/**
 * TAdmin generated by MyEclipse Persistence Tools
 */

public class TAdmin extends BaseModel implements IIdAware {
	private static final long serialVersionUID = -6644078115293929438L;
	
	private Long id;
	private String username;// 用户名
	private String password;
	private String email;
	private String tel;
	private String realname;

	// Constructors

	/** default constructor */
	public TAdmin() {
	}

	/** full constructor */
	public TAdmin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

}