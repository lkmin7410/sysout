package com.jdbc.app.entity;

import java.util.Date;

public class NoticeComment {
	
 private int id;
 private int mid;
 private String writerID;
 private Date regDate;
 private String comment;
 
 public NoticeComment() {
	  
 }
 
public NoticeComment(int id, int mid, String writerID, Date regDate, String comment) {
	this.id = id;
	this.mid = mid;
	this.writerID = writerID;
	this.regDate = regDate;
	this.comment = comment;
}

public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getWriterID() {
	return writerID;
}
public void setWriterID(String writerID) {
	this.writerID = writerID;
}
public Date getRegDate() {
	return regDate;
}
public void setRegDate(Date regDate) {
	this.regDate = regDate;
}
	
 
}
