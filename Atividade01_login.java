package curso27;

import java.util.Scanner;

public class Atividade01_login {

	public static void main(String[] args) {
	String login = "gigi";
	String senha = "kdfz2583";
	Scanner ler = new Scanner(System.in);
	String l;
	String s;
	
	
	System.out.println("Informe o seu login: ");
	l= ler.next();
	
	System.out.println("Informe a sua senha: ");
	s= ler.next();
	
	
	if (l.equals(login)&s.equals(senha)){
		System.out.println("Bem vindo ao Sistema Senai!: ");
		
	}
		
	else {
		System.out.println("Dados incorretos, informe os dados novamente.");
	}
	
	}

}
