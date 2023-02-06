//ureðaj prekidaè
public class prekidac {
	public boolean komanda;
    public String identifikator;
    public int stanje;
    public boolean gubitakSF6;
    public boolean blokadaRada;
    public boolean blokadaIskopa;
    public boolean oprugaNavijenaKvar;
    
    prekidac () {
    	komanda = true;
    	identifikator = "LTB 145 D1 ABB";
    	stanje = 1;
    	gubitakSF6 = false;
    	blokadaRada = false;
    	blokadaIskopa = false;
    	oprugaNavijenaKvar = false;
	}
    
}
