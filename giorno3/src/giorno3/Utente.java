package giorno3;

import java.util.Date;



public class Utente {
	private String password;
	private String nome;
	private int id;
	
	


public Utente (String nome,String password,int id) {
	

this.nome=nome;
this.password=password;
this.id=id;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
		
	}
	
   @Override
   public String toString() {
	
	return nome + " " + password+" " + id;
}

}