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
		ordine();
	}
	
	public ArrayList<String> getElenco() {
		ordine();
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
	
	private void ordine() {
		Collections.sort(elenco);
		Collections.reverse(elenco);
		Collections.sort(elenco, String.CASE_INSENSITIVE_ORDER);
	}

}
