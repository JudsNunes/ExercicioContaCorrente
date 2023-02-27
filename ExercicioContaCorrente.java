package Aula24;

import java.util.Scanner;


public class ExercicioContaCorrente {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		ContaCorrente conta =  new ContaCorrente();
		
		conta.cpf = 704527644;
		conta.nomeTitular = "Lucas";
		conta.salario = 1000;
		conta.saldo = 11.500;
		
		System.out.println("Digite aqui o seu nome");
		String nome = scan.next();
		System.out.println("Digite aqui o seu cpf");
		int leitor =scan.nextInt();
		System.out.println("Digite aqui a sua renda mensal");
		int renda = scan.nextInt();
		System.out.println("Digite aqui o Saldo da sua conta atualmente");
		double saldoConta = scan.nextDouble();
		
		
		boolean validacao = false;
		
		do {
			
			if(nome == conta.nomeTitular && leitor == conta.cpf) {
				System.out.println("A primeira Etapa de Validação foi Concluída precisamos colher mais informações sobre o senhorr" +nome);
				validacao = true;
			}else {
				System.out.println("Verificação Incorreta tente novamente");
			}
			
		}while(!validacao);
	
		boolean validacaoSegunda = false;
		
		do {
			
			if(renda == conta.salario && saldoConta == conta.saldo) {
				System.out.println("Verificação concluída com sucesso iremos dar prosseguimento na sua solicitação");
				validacaoSegunda = true;
			}else {
				System.out.println("Verificação incorreta,tente novamente.");
			}
			
			
			
		}while(!validacaoSegunda);
		
		
		
		

	}

}
