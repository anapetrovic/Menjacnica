package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijaInterfejsa.MenjacnicaInterfejs;

public class KursnaLista implements MenjacnicaInterfejs {

	
	private LinkedList<Kurs> kursevi= new LinkedList<Kurs>();


	public void dodajKurs(double kupovni, double prodajni, double srednji,
			GregorianCalendar datum) {

		Kurs noviKurs = new Kurs();
		noviKurs.setDatum(datum);
		noviKurs.setKupovni(kupovni);
		noviKurs.setProdajni(prodajni);
		noviKurs.setSrednji(srednji);
		
		kursevi.add(noviKurs);
	}

	public void obrisiKurs(GregorianCalendar datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum))
				kursevi.remove(kursevi.get(i));
			
		}

	}

	public double[] pronadjiKurs(GregorianCalendar datum) {
		double[] kurseviNaDan = new double[3];
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum)){
				kurseviNaDan[0]=kursevi.get(i).getKupovni();
				kurseviNaDan[1]=kursevi.get(i).getProdajni();
				kurseviNaDan[2]=kursevi.get(i).getSrednji();
				break;
				
			}
				
			
		}
		return kurseviNaDan;
	}

}
