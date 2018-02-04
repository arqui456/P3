package project;


public class Recurses {

	private String name;
	private Date deadline;
	private User admin;
	private String status;
		
	public Recurses(String name, Date deadline, User admin) {
		
		if(name == "laboratorio"  ||
	       name == "auditorio"    ||
		   name == "sala de aula" ||
		   name == "projetor" ) {
			this.name = name;
			this.status = "Em processo de alocação";
		}
		else
			System.out.println("Recurso inexistente ou indisponivel");
		this.deadline = deadline;
		
		if(admin.getCategory() == "professor"  ||
		   admin.getCategory() == "pesquisador"||
		   admin.getCategory() == "administrador") {
			
			this.status = "Alocado";
			this.admin = admin;
		}
			
		else {
			this.status = "Em processo de alocação";
			//System.out.println("Erro, Usuário não tem nível de acesso necessário para realizar essa ação");
		}
	}
	
	public Recurses(Recurses rec, User admin) {
		if(admin.getCategory() == "professor"  ||
	       admin.getCategory() == "pesquisador"||
		   admin.getCategory() == "administrador") {
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
		return "Recurses [\nname = " + name + ", \ndeadline = " + deadline + ", \nadmin = "
				+ admin.getCategory() + ", \nstatus = " + status + "]";
	}
}
