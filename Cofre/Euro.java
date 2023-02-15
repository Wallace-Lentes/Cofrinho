package Cofre;



import java.text.DecimalFormat;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void Info() 
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println( "�" + df.format(valor) );
	}
	
	@Override
	public double Converter(Moeda moeda)
	{
		return moeda.valor * 5.18;
	}
	
}