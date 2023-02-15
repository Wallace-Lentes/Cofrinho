package Cofre;


import java.util.Scanner;

import java.io.IOException;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
				
		Cofre cofrinho = new Cofre();
		int option = -1;
		double valor;
		Moeda moeda;
		

		while (option != 7)
		{
			option = Menu(teclado);
		
			switch(option)
			{
				case 1:
					System.out.println("Insira um valor em Dolar: ");
					valor = teclado.nextDouble();
					moeda = new Dolar(valor);
					cofrinho.AdicionarMoedas(moeda);
					break;
				case 2:
					System.out.println("Insira um valor em Real: ");
					valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofrinho.AdicionarMoedas(moeda);
					break;
				case 3:
					System.out.println("Insira um valor em Euro: ");
					valor = teclado.nextDouble();
					moeda = new Euro(valor);
					cofrinho.AdicionarMoedas(moeda);
					break;
				case 4:
					System.out.println("Identifique o valor a ser removido: ");
					valor = teclado.nextInt();
					cofrinho.RemoverMoeda(valor);
					break;
				case 5:
					cofrinho.ListarMoedas();
					break;
				case 6:
					System.out.println("Temos R$" + df.format(cofrinho.TotalConversao()) + " guardados.");
					break;
				case 7:
					System.out.println("Fim do aplicativo Cofrinho.");
			}			
			teclado.nextLine();
		}
			
		teclado.close();
	}
	
	
	private static int Menu(Scanner teclado) throws InterruptedException, IOException
	{
		int option;
		
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Guardar Dolar");
		System.out.println("2 - Guardar Real");
		System.out.println("3 - Guardar Euro");
		System.out.println("4 - Remover moeda pelo valor");
		System.out.println("5 - Listar todas as moedas");
		System.out.println("6 - Total convertido em real");
		System.out.println("7 - Sair");
		
		try {
			option = teclado.nextInt();
		}catch(Exception  e)
		{
			System.out.println("Digite apenas números!");
			ClearBuffer(teclado);
			option = teclado.nextInt();
		}
		
		
		if(option < 0)
		{
			System.out.println("Opção inválida, tente novamente!");
			
			Menu(teclado);
		}

		return option;

	}
	
	private static void ClearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}