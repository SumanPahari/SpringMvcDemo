package com.suman.web;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Alien {
	
	@Id
	private int aid;
	private String aname;
	private String tech;
	
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAtech() {
		return tech;
	}
	public void setAtech(String atech) {
		this.tech = atech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", atech=" + tech + "]";
	}
	
	
	
	

}
