package com.ldp.itcast.domain;

import java.io.Serializable;

public class Question implements Serializable{
	private int id;
	private String content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + "]";
	}
	
	
}
