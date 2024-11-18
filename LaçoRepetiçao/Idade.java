package exercícios;

import java.util.Scanner;

public class Idade {

	public static void main (String args[]) {
		Scanner Ler = new Scanner(System.in);
		double nascimento, ano, idade;
		System.out.println("Digite o seu ano de nascimento");
		nascimento = Ler.nextDouble();
		
		System.out.println("Digite o ano atual");
		ano  = Ler.nextDouble();
		
		idade = ano - nascimento;
		
		System.out.println("A sua idade é: " + idade);
		
		Ler.close();
		
	}
	
}
