package curso27;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Informe o primeiro numero: ");
		numero1= ler.nextInt();
		
		
		System.out.println("Informe o segundo numero: ");
		numero2= ler.nextInt();
		
		
		System.out.println("Informe o terceiro numero: ");
		numero3= ler.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O primeiro é o maior.");
		}
	
		else if (numero2 > numero3) {
			System.out.println("O segundo número é o maior.");
		}
		
		else if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("Os números são iguais");
		}
		
		else {
			System.out.println("O terceiro número é o maior");
		}
		
		// Verificar o menor		
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("o número um é o menor.");
		}
		
		else if (numero2 < numero3) {
			System.out.println("O segundo número é o menor");
		}
		
		else if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("Os números são iguais");
		}
		
		else {
			System.out.println("O terceiro número é o menor.");
		}
		
		
		
	}

}

	
