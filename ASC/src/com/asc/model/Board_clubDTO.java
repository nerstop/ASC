package com.asc.model;

public class Board_clubDTO {

	private Integer seq;
	private String member;
	private String title;
	private String content;
	private String time;
	private String club;
	
	
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	
	@Override
	public String toString() {
		return "Board_clubDTO [seq=" + seq + ", member=" + member + ", title=" + title + ", content=" + content
				+ ", time=" + time + ", club=" + club + "]";
	}
	

	
	
	
}
