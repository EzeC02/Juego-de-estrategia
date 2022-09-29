package juegodeestrategia;

public class Unidades {
private double Daño;
private double Salud;
private int Pocicion;


Unidades(double Daño,double Salud,int Pocicion){
	this.Daño=Daño;
	this.Salud=Salud;
	this.Pocicion=Pocicion;
}
double mostrarDaño() {
	return this.Daño;
}
double mostrarSalud() {
	return this.Salud;
}
int mostrarPocicion() {
	return this.Pocicion; 
}

}
