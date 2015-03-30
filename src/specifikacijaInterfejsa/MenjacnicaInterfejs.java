package specifikacijaInterfejsa;

import java.util.GregorianCalendar;


public interface MenjacnicaInterfejs {
	
	public void dodajKurs(double kupovni, double prodajni, double srednji, GregorianCalendar datum);
	public void obrisiKurs( GregorianCalendar datum);
	public double[] pronadjiKurs(GregorianCalendar datum);

}
