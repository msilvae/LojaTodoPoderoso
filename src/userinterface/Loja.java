package userinterface;

import java.util.Scanner;

import core.Cliente;
import core.ClienteFiel;

public class Loja {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao=0;
		double valor=0.0d;
		
		//Cliente cliente = new Cliente("Marcinha", "marcinha@itau.com.br", 1000d);
		Cliente cliente = new ClienteFiel("Iza", "iza@itau.com.br", 1000d,15);
		
		do {
			System.out.println("Ola " + cliente.getNome());
			System.out.println("1 = Comprar / 2 = Pagar Fatura / 3 = Extrato / -1 = Sair");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			
			case 1: //Comprar
				System.out.println("Digite o valor da compra:");
				valor = teclado.nextDouble();
				if(cliente.comprar(valor))
					System.out.println("compra realizada com sucesso");	
				else	
					System.out.println("compra negada");
				break;
			case 2: //Pagar
				System.out.println("Digite o valor para pagamento:");
				valor = teclado.nextDouble();

				cliente.pagarFatura(valor);
				
				break;
			case 3: //Extrato
				System.out.println(cliente.exibirFatura());
				break;
			case -1: //Sair
				System.out.println("**** Obrigado pela preferencia");
				break;
			default:
				System.out.println("opcao invalida");
				break;
			}
			
		}while (opcao != -1);		
		
		teclado.close();
		
	}

}
