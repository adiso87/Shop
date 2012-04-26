package com.jelastic.adiso87.Shop;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service("hello")
public class HelloBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

	public HelloBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSayHello(){
		//check if it's not null
		if("".equals(name) || name==null){
			return "";
		}else{
			return "Ajax Message: Welcome " + name;
		}
	}
}