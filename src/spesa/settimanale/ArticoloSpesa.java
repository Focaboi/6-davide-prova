package spesa.settimanale;

public class ArticoloSpesa {
	
	
	String nome;
	String categoria;
	double prezzoUnitario;
	int quantita;
	boolean acquistato;
	
	
	
	public double calcolaTotaleArticolo()
	{
		return prezzoUnitario*quantita;
	}
	
	
	
	//per controllare se il prezzo è valido o no
	public static boolean prezzoValido(double prezzo)
	{
		return prezzo >= 0;
	}
	
	//per controllare se una quantità è valida
	public static boolean quantitaValida(int quantita)
	{
		return quantita > 0;
	}
	
	//confrontare due articoli in base al totale
	public static ArticoloSpesa articoloConTotaleMaggiore(ArticoloSpesa a1, ArticoloSpesa a2)
	{
		if (a1.calcolaTotaleArticolo() >= a2.calcolaTotaleArticolo())
		{
			return a1;
		}
		else
		{
			return a2;
		}
		
		
		
		
	}
	
	
	
}
