package juegodeestrategia;

public class Caballero extends Unidades implements Acciones {
private int Caballo;


public Caballero(int poc) {

super(50,200,poc);
this.Caballo=true;

}

	@Override
	public void Atacar() {
		if(Caballo!=3) {
			Caballo++;
			
		}
			
		
		


	}

}
