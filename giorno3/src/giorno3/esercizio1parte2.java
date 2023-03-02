package giorno3;

import java.util.ArrayList;
import java.util.Scanner;

public class esercizio1parte2 {

	public static void main(String[] args) {
		
		boolean continua=true;
		
		System.out.println("Vuoi registrarti o loggare o uscire?");
		
		Scanner rispostaCase= new Scanner(System.in);
		
		String risposta ="0";
		String nome="0";
		String password="0";
		int id =0;	
		
		ArrayList insiemeUtente = new ArrayList<Object> ();
		
		
		
		
		while(continua=true) {
			
			risposta=rispostaCase.nextLine();
			;
			
			switch(risposta) {
			
			case "R":
				
				System.out.println("Inserisci Nome:");
				nome=rispostaCase.nextLine();
				System.out.print("Crea Password:");
				password=rispostaCase.nextLine();
				
				
				break;
				
			case "L":
				System.out.println("Inserisci id:");
				id=rispostaCase.nextInt();
				System.out.println("Inserisci Nome:");
				nome=rispostaCase.nextLine();
				System.out.print("Inserisci Password:");
				password=rispostaCase.nextLine();
				
				break;
				
			case "U":
				break;
			}
			
			 Utente Utente1=new Utente(nome ,password, id);
			 Utente1.getPassword();
			 Utente1.getNome();
			 Utente1.getId();
			 insiemeUtente.set(id, Utente1);
			 System.out.println(Utente1.toString());
			 
		}

	}

}
