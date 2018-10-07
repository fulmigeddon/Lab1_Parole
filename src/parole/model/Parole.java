package parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Parole {
	
	private ArrayList<String> elenco;
	private Comparator<String> confronto;
	
	public Parole() {
		elenco = new ArrayList<String>();
		confronto = new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareToIgnoreCase(arg1);
			}
		};
	}
	
	public void addParola(String p) {
		elenco.add(p);
		Collections.sort(elenco, confronto);
	}
	
	public ArrayList<String> getElenco() {
		Collections.sort(elenco, confronto);
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
