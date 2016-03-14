package com.lb.pg;

public class Course {
	
	private int id;
	private String cname;
	private String cid;
	private String cteacher;
	private String credit;
	
	public Course(){
		
	}
	public Course(String cname,String cid,String cteacher,String credit){
	
		this.cname = cname;
		this.cid = cid;
		this.cteacher = cteacher;
		this.credit = credit;
	}
	
	public Course(int id ,String cname,String cid,String cteacher,String credit){
		this.id = id;
		this.cname = cname;
		this.cid = cid;
		this.cteacher = cteacher;
		this.credit = credit;
	}
	
	public int getId(){
		return id;
	}
	
	public String getCname(){
		return cname;
	}
	
	public String getCid(){
		return cid;
	}
	
	public String getCteacher(){
		return cteacher;
	}
	
	public String getCredit(){
		return credit;
	}

}
