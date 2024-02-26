package com.jas.aTestProject.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "user")
@RequestScoped
public class userBean implements Serializable {
	
	public static String text;

	public userBean() {

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
