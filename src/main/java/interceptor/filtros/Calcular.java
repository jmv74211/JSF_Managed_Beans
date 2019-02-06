package interceptor.filtros;

import interceptor.Filtro;

public class Calcular implements Filtro{
	
	// Calcula y devuelve la velocidad
	public double ejecutar(Object o) {
		double distancia = new Double(o.toString());
		System.out.println("Recibo distancia" + distancia);
		double velocidad = distancia*3600/INTERVALO;
		System.out.println(velocidad);
		return velocidad;
	}
}