package Cofre;



import java.util.ArrayList;

public class Cofre {

		int id = 1;
		
		public ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
		
		public void AdicionarMoedas(Moeda moeda)
		{
			moeda.id = id++;
			
			listaMoeda.add(moeda);
			
		}
		
		public void RemoverMoeda(double valor)
		{
			Moeda moedaEncontrada = null;
			
			for(Moeda moeda : listaMoeda)
			{
				if(moeda.valor == valor)
				{
					moedaEncontrada = moeda;
					break;
				}
			}
			
			if(moedaEncontrada != null)
			{
				listaMoeda.remove(moedaEncontrada);
			}
			else
			{
				System.out.println("Nenhuma moeda corresponde a esse valor.");
			}
			
		}
		
		public void ListarMoedas()
		{
			for(Moeda moeda : listaMoeda)
			{
				System.out.print(moeda.id + " - ");
				moeda.Info();
			}
		}
		
		public double TotalConversao()
		{
			double total = 0;
			
			for(Moeda moeda : listaMoeda)
			{
				total += moeda.Converter(moeda);
			}
			
			return total;
		}
}
