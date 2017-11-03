package model;

public class User {
	
	public String FName, LName, Age, Gender, Job, UserId;
	
	public User(String fname, String lName, String age, String gender, String job, String userId) {
		
		this.FName = fname;
		this.LName = lName;
		this.Age = age;
		this.Gender = gender;
		this.Job = job;
		this.UserId = userId;
	}
	
	@Override
	public String toString() {
		return "User [fname=" + FName + ",LName= " + LName + ",Age=" + Age + ", Gender=" + Gender + ", Job=" + Job + ",UserId=" + UserId + "]";
		
		
	}
}