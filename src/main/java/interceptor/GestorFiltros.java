package interceptor;

import java.io.IOException;
import java.net.URISyntaxException;

public class GestorFiltros {
	private CadenaFiltros cadenaFiltros;
	
	public GestorFiltros(Interfaz _objetivo){
		this.cadenaFiltros= new CadenaFiltros();
		this.cadenaFiltros.setObjetivo(_objetivo);
	}
	
	//Añade un nuevo filtro a la cadena
	public void addFiltro(Filtro _filtro){
		this.cadenaFiltros = new CadenaFiltros();
		this.cadenaFiltros.addFiltro(_filtro);
	}
	
	public void setFiltro(Filtro _filtro) {
		this.cadenaFiltros.addFiltro(_filtro);
	}
	
	// Ejecuta la petición en todos los filtros de la cadena.
	public void ejecutarPeticionEnFiltros(double peticion) throws IOException, URISyntaxException {
		this.cadenaFiltros.ejecutar(peticion);
	}

}
