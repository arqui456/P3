package project;

import java.util.ArrayList;


public class User {

	private String name;
	private String email;
	private ArrayList<String> history;
	private String category;
	
	//= new ArrayList<String>();
	
	//items.add("red");
	//items.size();
	//items.get(4);
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public User(String name, String email, ArrayList<String> history, String category) {
		
		this.name = name;
		this.email = email;
		this.category = category;
		this.history = history;
	}
	
	
}
