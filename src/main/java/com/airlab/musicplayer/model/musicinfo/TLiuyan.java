package com.airlab.musicplayer.model.musicinfo;

import java.util.Date;

import com.airlab.musicplayer.model.BaseModel;
import com.airlab.musicplayer.model.IIdAware;

/**
 * TLiuyan generated by MyEclipse Persistence Tools
 */

public class TLiuyan extends BaseModel implements IIdAware {
	private static final long serialVersionUID = 4331373360856176761L;
	
	private Long id;// 主键id
	private String names;// 内容
	private String descs;// 内容
	private Date times;// 时间

	// Constructors

	/** default constructor */
	public TLiuyan() {
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

	public Date getTimes() {
		return times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

}