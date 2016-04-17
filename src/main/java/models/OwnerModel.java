package models;

public class OwnerModel {
	private int id;
	private String login;
	private String password;
	private String name;
	private String lastName;
	private String phoneNumber;
	
	public OwnerModel(int id, String login, String password, String name, String lastName, String phoneNumber){
		setId(id);
		setLogin(login);
		setPassword(password);
		setName(name);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
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
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
