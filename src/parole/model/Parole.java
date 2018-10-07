package parole.model;

import java.util.ArrayList;
import java.util.Collections;

public class Parole {
	
	private ArrayList<String> elenco;
	
	public Parole() {
		elenco = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		elenco.add(p);
		Collections.sort(elenco);
	}
	
	public ArrayList<String> getElenco() {
		Collections.sort(elenco);
		return elenco;
	}
	
	public String concatenaParole(String carattere) {
		String concatenazione = "";
		for (int i = 0; i < elenco.size(); i++) 
			concatenazione += (elenco.get(i)+carattere);
		return concatenazione;
	}
	
	public void reset() {
		elenco.clear();
	}
	
	public void eliminaParola(String parola) {
		elenco.remove(parola);
	}

}
