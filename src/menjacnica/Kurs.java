package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	 

		private double kupovni;
	    private double srednji;
	    private double prodajni;
	    private GregorianCalendar datum;
	    
	    public Kurs(double kupovni, double srednji, double prodajni, GregorianCalendar datum){
	        this.kupovni = kupovni;
	        this.srednji = srednji;
	        this.prodajni = prodajni;
	        this.datum = datum;
	    }

		public double getKupovni() {
			return kupovni;
		}

		public void setKupovni(double kupovni) {
			this.kupovni = kupovni;
		}

		public double getSrednji() {
			return srednji;
		}

		public void setSrednji(double srednji) {
			this.srednji = srednji;
		}

		public double getProdajni() {
			return prodajni;
		}

		public void setProdajni(double prodajni) {
			this.prodajni = prodajni;
		}

		public GregorianCalendar getDatum() {
			return datum;
		}

		public void setDatum(GregorianCalendar datum) {
			this.datum = datum;
		}
	}



