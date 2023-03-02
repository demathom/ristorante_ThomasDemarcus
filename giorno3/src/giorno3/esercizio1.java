package giorno3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class esercizio1 {

	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		boolean continua = true;
		boolean si = true;
		boolean no = false;
		Scanner risposta = new Scanner(System.in);
		Scanner risposta1 = new Scanner(System.in);
		String oggetto;
		String scelta ;
		
		String[] menu = {
		"pasta, 6 euro, A",
		"carne, 8 euro, B",
		"pesce, 10 euro, C",
		"dolce, 5 euro, D",
		"caffe, 1 euro, E",
		};
		
		
		
		
		while(continua) {
			if(risposta.equals(si)) {continua=true;}
			else if(risposta.equals(no)){continua=false;}
			System.out.println("Vuoi ordinare? Rispondi con SI o NO");
			oggetto=risposta.nextLine();
			System.out.println("Vuoi vedere il menu? Rispondi con SI o NO");
			oggetto=risposta1.nextLine();
			System.out.println(menu[0]);
			System.out.println(menu[1]);
			System.out.println(menu[2]);
			System.out.println(menu[3]);
			System.out.println(menu[4]);
			System.out.println("Seleziona il piatto/bevanda:");
		
			oggetto=risposta1.nextLine();
			
			System.out.println("Vuoi selezionare altro?");
			if(oggetto.equals("SI")) {continua=true;
			
			return;}
			else if(oggetto.equals("NO")) {continua=false;}
			oggetto=risposta1.nextLine();
			switch(oggetto) {
			
			case "A":
				System.out.println(menu[0]);
			break;
			case "B":
				System.out.println(menu[1]);
			break;
			case "C":
				System.out.println(menu[2]);
			break;
			case "D":
				System.out.println(menu[3]);
			break;
			case "E":
				System.out.println(menu[4]);
			break;
			
			}
			
			
			}
			
			
		}
		}
		

	


