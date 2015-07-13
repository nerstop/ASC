package com.asc.model;

public class MemberDTO {

	private String id;
	private String password;
	private String name;
	private String school;
	private String department;
	private Integer finish;
	private String password_hint;
	private String password_answer;
	private String tel;
	private String starttime;
	private String endtime;
	private Integer state;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getFinish() {
		return finish;
	}
	public void setFinish(Integer finish) {
		this.finish = finish;
	}
	public String getPassword_hint() {
		return password_hint;
	}
	public void setPassword_hint(String password_hint) {
		this.password_hint = password_hint;
	}
	public String getPassword_answer() {
		return password_answer;
	}
	public void setPassword_answer(String password_answer) {
		this.password_answer = password_answer;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", school=" + school
				+ ", department=" + department + ", finish=" + finish + ", password_hint=" + password_hint
				+ ", password_answer=" + password_answer + ", tel=" + tel + ", starttime=" + starttime + ", endtime="
				+ endtime + ", state=" + state + "]";
	}
	
	
}
