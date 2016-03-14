package com.lb.pg;

public class User {

	private String id;
	private String name;
	private String code;
	private String kind;

	public User() {

	}
	
	public User(String id, String code){
		this.id = id;
		this.code = code;
	}

	public User(String id, String name, String code, String kind) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.kind = kind;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
}
