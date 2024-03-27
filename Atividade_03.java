package curso27;

import java.util.Scanner;

public class Atividade_03 {

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
			System.out.println("O número 1 é o maior.");
		}
	
		else if (numero2 > numero3) {
			System.out.println("O número 2 é o maior.");
		}
		
		else {
			System.out.println("O terceiro número é o maior.");
		}
		
	}

}
