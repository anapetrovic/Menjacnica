package menjacnica;

import java.util.LinkedList;

public class Menjacnica {
	 private LinkedList<Valuta> valute= new LinkedList<Valuta>();

		public LinkedList<Valuta> getValute() {
			return valute;
		}

		public void setValute(LinkedList<Valuta> valute) {
			this.valute = valute;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((valute == null) ? 0 : valute.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Menjacnica)) 
			return false; 
		Menjacnica m = (Menjacnica)(obj); 
		LinkedList<Valuta> v= new LinkedList<Valuta>();
		for (int i = 0; i < valute.size(); i++) {
			for (int j = 0; j < m.getValute().size(); j++) {
				if(valute.get(i).equals(m.getValute().get(j))){
					v.add(valute.get(i));
					break;
				}
			}
		}
		if (v.size()==valute.size())
			return true; 
		
		else return false;
		}

		@Override
		public String toString() {
			String s="";
			for(int i=0; i<valute.size();i++){
				 s="\n"+valute.get(i).toString();
			}
			return "Valute:" +  s ;
		}
		}
		
		


