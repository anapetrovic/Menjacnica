package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
    private String skr_naziv;
    private LinkedList<Kurs> kursevi;
    
    public Valuta(String naziv, String skr_naziv){
        this.naziv = naziv;
        this.skr_naziv = skr_naziv;
        this.kursevi = new LinkedList<Kurs>();
    }

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkr_naziv() {
		return skr_naziv;
	}

	public void setSkr_naziv(String skr_naziv) {
		this.skr_naziv = skr_naziv;
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skr_naziv == null) ? 0 : skr_naziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Valuta)) 
			return false; 
		Valuta v = (Valuta)(obj); 
		if (naziv.equals(v.getNaziv()))
			return true; 
		
		else return false;

	}

	@Override
	public String toString() {
		String s="";
		for(int i=0; i<kursevi.size();i++){
			 s="\n"+kursevi.get(i).toString();
		}
		return "Valuta:" + naziv + " (" + skr_naziv
				+ ") kursevi:" + s ;
	}
	
	

}
