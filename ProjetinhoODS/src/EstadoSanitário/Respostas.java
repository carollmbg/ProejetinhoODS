package EstadoSanitário;

public class Respostas extends Perguntas {
	
	
	public void Perguntas(String nome, String cpf, String cidade, int n_moradores, String problema_agua, 
			String cheiro, String alaga, int  lixo, String rua, String coleta)
	{

		this.nome = nome;
		this.cpf = cpf;
		this.cidade = cidade;
		this.n_moradores = n_moradores;
		this.problema_agua = problema_agua;
		this.cheiro = cheiro;
		this.alaga = alaga;
		this.nome = lixo;
		this.nome = rua;
		this.nome = coleta;
	}
		

}


switch(op)
{
case 1:
	System.out.println("\nEncanado para o rio");
case 2:
	System.out.println("\nFossa séptica");
case 3:
	System.out.println("\nEncanado para estação de tratamento de esgoto");
case 4:
	System.out.println("\nfossa negra");
case 5:
	System.out.println("\nfossa negra");