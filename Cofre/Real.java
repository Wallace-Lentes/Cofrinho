package Cofre;



import java.text.DecimalFormat;

public class Real extends Moeda
{
	public Real(double valor) {
		super(valor);
	}

	@Override
	public void Info() 
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println( "R$" + df.format(valor) );
	}
	
	@Override
	public double Converter(Moeda moeda)
	{
		return moeda.valor;
	}
}