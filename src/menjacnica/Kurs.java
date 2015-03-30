package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	 

		private double kupovni;
	    private double srednji;
	    private double prodajni;
	    private GregorianCalendar datum;
	    
	  


		public double getKupovni() {
			return kupovni;
		}

		public void setKupovni(double kupovni) {
			if(kupovni==0) throw new RuntimeException("Morate uneti kurs");
			this.kupovni = kupovni;
		}

		public double getSrednji() {
			return srednji;
		}

		public void setSrednji(double srednji) {
			if(srednji==0) throw new RuntimeException("Morate uneti kurs");
			this.srednji = srednji;
		}

		public double getProdajni() {
			return prodajni;
		}

		public void setProdajni(double prodajni) {
			if(prodajni==0) throw new RuntimeException("Morate uneti kurs");
			this.prodajni = prodajni;
		}

		public GregorianCalendar getDatum() {
			return datum;
		}

		public void setDatum(GregorianCalendar datum) {
			this.datum = datum;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((datum == null) ? 0 : datum.hashCode());
			long temp;
			temp = Double.doubleToLongBits(kupovni);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(prodajni);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(srednji);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Kurs)) 
				return false; 
			Kurs k = (Kurs)(obj); 
			if (kupovni==k.getKupovni()
					&& srednji==k.getSrednji()
					&& prodajni==k.getProdajni() 
					&& datum.equals(k.getDatum())) 
				return true; 
			
			else return false;

		}

		@Override
		public String toString() {
			return "{datum: "+this.datum.toString()+", "
					+ "kupovni: "+this.kupovni+", "
							+ "srednji: "+this.srednji+","
									+ " prodajni: "+this.prodajni+")";
	    
		}
		
		
	}




