package operadores;

import java.util.Scanner;

public class OperadorOu {
	
	//operador ou -> preciso que apenas um dos argumentos seja "True"

	public static void main(String[] args) {
		int idade;
		boolean pais;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nEstá acompanhade de seus responsáveis? (true/ false) ");
		pais = leia.nextBoolean();
		
		if(idade >= 18 || pais ) {
			
			
			System.out.println("Pode entrar no show!");
		}else {
			System.out.println("Ainda não pode entrar no show!");
		}
		
		
		leia.close();
			
	}

}
