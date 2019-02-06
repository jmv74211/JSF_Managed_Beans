package interceptor;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class CadenaFiltros {
	private ArrayList<Filtro> filtros;
	private Interfaz objetivo;
	
	public CadenaFiltros() {
		this.filtros = new ArrayList<Filtro>();
	}
	
	public void addFiltro(Filtro _filtro){
		this.filtros.add(_filtro);
	}
	
	//Ejecuta todos los filtros que se han creado desde el main.
	public void ejecutar(double peticion) throws IOException, URISyntaxException{
		for(Filtro f:filtros){
			System.out.println("Nueva velocidad (m/s) "+f.ejecutar(peticion));
		}
		this.objetivo.ejecutar(peticion);
	}
	
	//Fija el objetivo del patrón interceptor
	public void setObjetivo(Interfaz _objetivo){
		this.objetivo = _objetivo;
	}
		
}
