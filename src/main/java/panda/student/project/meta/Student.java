package panda.student.project.meta;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class Student {
	
	/**
	 * ID
	 */
	private int id;
	/**
	 * 学号
	 */
	private int no;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String pwd;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 入学时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date entranceTime;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 头像
	 */
	private String photo;
	/**
	 * 生日
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date birth;
	/**
	 * 学历
	 */
	private String education;
	/**
	 * 目前状态
	 */
	private String status;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getEntranceTime() {
		return entranceTime;
	}
	
	public void setEntranceTime(Date entranceTime) {
		this.entranceTime = entranceTime;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public Date getBirth() {
		return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public String getEducation() {
		return education;
	}
	
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
