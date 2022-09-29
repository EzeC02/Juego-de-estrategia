package juegodeestrategia;

public class Soldado extends Unidades implements Acciones {

private int energia;

Soldado(int poc){
	super(10,200,poc);
	this.energia=100;
	
}

@Override
public void Atacar(){
	if (this.energia>0) {
		this.energia-=10;
}
}
}
