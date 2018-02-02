package project;

public class Recurses {

	private String name;
	private Date deadline;
	private User admin;
	private String status;
	
	public Recurses(String name) {
		this.name = name;
		this.status = "Em processo de alocação";
	}
	
	public Recurses(String name, Date deadline) {
		this.name = name;
		this.deadline = deadline;
		this.status = "Em processo de alocação";
	}
	
	public Recurses(String name, Date deadline, User admin) {
		
		this.name = name;
		this.deadline = deadline;
		
		if(admin.getCategory() == "professor"  ||
		   admin.getCategory() == "pesquisador"||
		   admin.getCategory() == "admin") {
			
			this.status = "Alocado";
			this.admin = admin;
		}
			
		else {
			this.status = "Em processo de alocação";
			System.out.println("Erro, Usuario nao tem nivel de acesso necessario para realizar essa acao");
		}
			
	}
	
	public Recurses(Recurses rec, User admin) {
		if(admin.getCategory() == "professor"  ||
	       admin.getCategory() == "pesquisador"||
		   admin.getCategory() == "admin") {
			if(rec.getName() != null && rec.getDeadline() != null)
				this.status = "Alocado";
			else 
				System.out.println("Erro, recurso nao contem todos os dados");
		}
		
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	@Override
	public String toString() {
		return "Recurses [name=" + name + ", deadline=" + deadline + ", admin="
				+ admin + ", status=" + status + "]";
	}
}
