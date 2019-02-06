package interceptor.filtros;

import interceptor.Filtro;

public class CalcularDistancia implements Filtro{
	private double revolAnt = 0; //Revoluciones anteriores
	
	public double ejecutar(Object o) {
		double revoluciones = new Double(o.toString());
		double distancia = (revoluciones-revolAnt)*2*RADIO*3.1416;
		revolAnt = revoluciones;
		
		return distancia;
	}

}