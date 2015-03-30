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

}
