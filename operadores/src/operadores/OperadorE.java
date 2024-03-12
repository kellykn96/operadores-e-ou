package operadores;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		//operador e -> preciso que dois argumentos retornem "True"
		
		int idade;
		boolean carteiraM;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nTem habilitação? (true/ false) ");
		carteiraM = leia.nextBoolean();
		
		if(idade >= 18 && carteiraM ) {
			
			
			System.out.println("Pode dirigir!");
		}else {
			System.out.println("Ainda não pode dirigir!");
		}
		
		
		leia.close();
			
		

	}

}
