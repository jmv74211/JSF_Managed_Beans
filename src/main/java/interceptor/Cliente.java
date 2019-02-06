package interceptor;

import java.io.IOException;
import java.net.URISyntaxException;

public class Cliente {
	
	public GestorFiltros gestorFiltros;
	
	public void setGestorFiltros( GestorFiltros _gestorFiltros){
		this.gestorFiltros = _gestorFiltros;
	}

	public void enviarPeticion(double peticion) throws IOException, URISyntaxException {
		this.gestorFiltros.ejecutarPeticionEnFiltros(peticion);
	}
}
