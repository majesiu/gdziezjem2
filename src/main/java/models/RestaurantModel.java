package models;

public class RestaurantModel {
	private int id;
	private String name;
	private String address;
	private String openingHoursWorkDays;
	private String openingHoursWeekend;
	private String description;
	private int ownerId;
	
	public RestaurantModel(int id, String name, String address, String openingHoursWorkDays, String openingHoursWeekend, String description, int ownerId){
		setId(id);
		setName(name);
		setAddress(address);
		setOpeningHoursWorkDays(openingHoursWorkDays);
		setOpeningHoursWeekend(openingHoursWeekend);
		setDescription(description);
		setOwnerId(ownerId);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getOpeningHoursWorkDays() {
		return openingHoursWorkDays;
	}
	
	public void setOpeningHoursWorkDays(String openingHoursWorkDays) {
		this.openingHoursWorkDays = openingHoursWorkDays;
	}
	
	public String getOpeningHoursWeekend() {
		return openingHoursWeekend;
	}
	
	public void setOpeningHoursWeekend(String openingHoursWeekend) {
		this.openingHoursWeekend = openingHoursWeekend;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
}
