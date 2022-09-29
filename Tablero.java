package juegodeestrategia;

public class Tablero {
private boolean Casillas[];
private int Tamaño;

public Tablero(int PocicionesDelTablero) {
	this.Casillas=new boolean [PocicionesDelTablero];
	this.Tamaño=PocicionesDelTablero;
}
public void modificarCasillas(int num) {
	this.Casillas[num]=true;
}
/*public int mostrarPocicion() {
	int poc=0;
	for(int i=0;i<this.Tamaño;i++) {
		if(this.Casillas[i]==true) {
			 poc=i;
		}
	}
	return poc;
}*/
}
