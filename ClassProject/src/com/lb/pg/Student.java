package com.lb.pg;

public class Student {

	private String id;
	private String name;
	private String clas;
	private String java;
	private String android;
	private String jsp;

	public Student(){
		
	}
	
	public Student(String name, String clas, String java, String android,String jsp){
		
		this.name = name;
		this.clas = clas;
		this.java = java;
		this.android = android;
		this.jsp = jsp;

	}
	
	
	public Student(String id ,String name, String clas, String java, String android,String jsp){
		this.id = id;
		this.name = name;
		this.clas = clas;
		this.java = java;
		this.android = android;
		this.jsp = jsp;

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

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getAndroid() {
		return android;
	}

	public void setAndroid(String android) {
		this.android = android;
	}

	public String getJsp() {
		return jsp;
	}

	public void setJsp(String jsp) {
		this.jsp = jsp;
	}
	


}
