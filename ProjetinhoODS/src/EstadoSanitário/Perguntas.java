package EstadoSanit�rio;

import java.util.ArrayList;
import java.util.Scanner;

public class Perguntas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
	try (Scanner leia = new Scanner(System.in)) {
		String nome, cpf,cidade,problema_agua,cheiro,alaga, lixo, rua,coleta,esgoto;
		int n_moradores=0;
		
		
		
		//Dados do usu�rio
		
		System.out.println("\nQual � o seu nome? ");
		nome = leia.next(); 
 
		 
		System.out.println("\nQual � o seu CPF? ");
		cpf = leia.next(); 
		
		System.out.println("\nQual � a sua cidade? ");
		cidade = leia.next(); 

		
		
		//Perguntas
		
		System.out.println("\n1. Quantas pessoas moram na casa?  ");
		n_moradores = leia.nextInt();
		
		if(n_moradores<0)
		{
			System.out.println("\nTente novamente\n1. Quantas pessoas moram na casa?");
		}
		
		
		
		System.out.println("\n2. Voc� costuma ter problemas com a �gua que utiliza em casa? ");
		problema_agua = leia.next();
		
		
		
		System.out.println("\n3. Para onde vai o esgoto de sua casa?");
		
			System.out.println("\na) Encanado para o rio");
			System.out.println("\nb) Fossa s�ptica");
			System.out.println("\nc) Encanado para esta��o de tratamento de esgoto");
			System.out.println("\nd) Fossa negra");
			System.out.println("\ne) corre a c�u aberto");
			esgoto = leia.next();
		
		
			
		System.out.println("\n4.  Na sua rua sente cheiro de esgoto?");
			cheiro = leia.next();
		
		
		System.out.println("\n5. Quando chove, sua rua fica alagada?");
			alaga = leia.next();
			
		System.out.println("\n6. Na sua rua, voc� v� lixo nas grades de drenagem ou bocas-de-lobo, ap�s as chuvas?");
			rua = leia.next();	
			
		System.out.println("\n7. O que � feito com o lixo produzido em sua casa?");
				
			System.out.println("\na) Coletado");
			System.out.println("\nb) Queimado");
			System.out.println("\nc) Enterrado");
			System.out.println("\nd) Jogado");
			System.out.println("\ne) Levado para ca�amba");
			lixo = leia.next();
		
			
			
		
		System.out.println("\n8. A coleta de lixo ocorre de forma regular em sua rua?");
			coleta = leia.next();
	}	
			
		
	}

	
		
	}

