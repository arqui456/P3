package tester;

import project.Recurses;
import project.User;
import project.Date;

public class SystemTester {
	
	public static void main(String[] args) {

		Date date = new Date(11,11,2018);
		User user1 = new User("Anarquimedes","avpfm@ic.ufal.br","pesquisador");
		User user2 = new User("Enzo","e@ic.ufal.br","graduação");
		
		
		
		Recurses recurse1 = new Recurses("sala de aula",date,user1);
		System.out.println(recurse1);
		System.out.println();
		
	}

}
