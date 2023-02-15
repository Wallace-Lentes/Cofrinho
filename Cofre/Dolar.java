package Cofre;



import java.text.DecimalFormat;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void Info() 
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println( "U$" + df.format(valor) );
	}
	
	@Override
	public double Converter(Moeda moeda)
	{
		return moeda.valor * 5.19;
	}
}