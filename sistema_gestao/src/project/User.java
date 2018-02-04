package project;

import java.util.ArrayList;


public class User {
	
	private String name;
	private String email;
	private ArrayList<String> history;
	private String category;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<String> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<String> history) {
		this.history = history;
	}

	public User(String name, String email, ArrayList<String> history, String category) {
		
		this.name = name;
		this.email = email;
		if(category == "graduação"   ||
	       category == "mestrado"    ||
		   category == "doutorado"   ||
		   category == "professor"   ||
		   category == "pesquisador" ||
		   category == "administrador") {
			this.category = category;
	     	}
		else 
			System.out.println("Usuario invalido,  categoria inexistente");
				
		this.history = history;
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, String email, String category) {
		this.name = name;
		this.email = email;
		
		if(category == "graduação"   ||
		   category == "mestrado"    ||
		   category == "doutorado"   ||
		   category == "professor"   ||
		   category == "pesquisador" ||
		   category == "administrador") {
			this.category = category;
		}
		else 
			System.out.println("Usuario invalido,  categoria inexistente");
		
	}

	@Override
	public String toString() {
		return "User [ \nname = " + name + ", \nemail = " + email + ", \nhistory = "
				+ history + ", \ncategory = " + category + "]";
	}

	
	//= new ArrayList<String>();
	
	//items.add("red");
	//items.size();
	//items.get(4);
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if(category == "graduação"   ||
		   category == "mestrado"    ||
		   category == "doutorado"   ||
		   category == "professor"   ||
		   category == "pesquisador" ||
		   category == "administrador") {
			this.category = category;
			}
		else 
			System.out.println("Usuario invalido,  categoria inexistente");
	}
	
}
