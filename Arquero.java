package juegodeestrategia;

public class Arquero extends Unidades implements Acciones {
private int Flechas;

public Arquero(int poc) {
	super(5,50,poc);
	this.Flechas=20;
}
public void recargarFlechas() {
	this.Flechas+=6;	
}
@Override
public void Atacar() {
	
}

}
