package veni.com.domain;

public class User {
	
	private String userId;
    private int number;
    private String title;
    private boolean completed;
	public User(String userId, int number, String title, boolean completed) {
		super();
		this.userId = userId;
		this.number = number;
		this.title = title;
		this.completed = completed;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
