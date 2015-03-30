package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijaInterfejsa.MenjacnicaInterfejs;

public class KursnaLista implements MenjacnicaInterfejs {
	private LinkedList<Kurs> kursevi=new LinkedList<Kurs>();

	public void dodajKurs(double kupovni, double prodajni, double srednji,
			GregorianCalendar datum) {
		Kurs novi =new Kurs(kupovni,prodajni, srednji,datum);
		kursevi.add(novi);
		

		
		

	}

	public void obrisiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	public double[] pronadjiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
