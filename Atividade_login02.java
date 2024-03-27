package curso27;

import java.util.Scanner;

public class Atividade_login02 {

	public static void main(String[] args) {
	try (Scanner ler = new Scanner(System.in)) {
		String login, senha;
		String l;
		String s;
		
		
		System.out.println("Cadastre seu login: ");
		login= ler.next();
		
		System.out.println("Cadastre a sua senha: ");
		senha= ler.next();
		
		System.out.println("VOCÊ FOI CADASTRADO COM SUCESSO!!");
		
		System.out.println("Informe o seu login: ");
		l= ler.next();
		
		System.out.println("Informe a sua senha: ");
		s= ler.next();
		
		
		if (l.equals(login)&s.equals(senha)){
			System.out.println("Bem vindo ao Sistema Senai!");
			
		}
			
		else {
			System.out.println("DADOS INCORRETOS, TENTE NOVAMENTE");
		}
	}
	
	}

}
