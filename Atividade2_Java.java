package curso27;

import java.util.Scanner;

public class Atividade2_Java {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String turno;
		String matutuino = "M";
		String vespertino = "V";
		String noturno = "N";
		
		System.out.println("Informe em qual turno você estuda");
		System.out.println("M para matutino, V para vespertino, N para noturno. ");
		turno = ler.next();
		
		if (turno.equals("M")){
			System.out.println("Bom dia!");
		}
			
		else if (turno.equals("V")){
		    System.out.println("Boa Tarde!");
		}
		
		else if (turno.equals("N")) {
	        System.out.println("Boa noite");
        }

        else {
        	System.out.println("Valor inválido!");

	}
	
}
}
