package _09.converListToMap;

import java.util.Date;

public class Hosting {

	private int Id;
	private String name;
	private Date createdDate;

	public Hosting(int id, String name, Date createdDate) {
		Id = id;
		this.name = name;
		this.createdDate = createdDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}