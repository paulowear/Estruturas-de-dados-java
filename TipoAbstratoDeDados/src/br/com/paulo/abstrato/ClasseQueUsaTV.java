package br.com.paulo.abstrato;

public class ClasseQueUsaTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisao t= new Televisao();
        t.defineMarca("Samsung");
        t.ligar();
        t.defineVolume(10);
        t.defineCanal(4);
        t.aumentaVolume();
        t.desligar();
	}

}
