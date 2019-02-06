package interceptor;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Interfaz {

		// Petición desde el cliente
		public double ejecutar(Object peticion) throws IOException, URISyntaxException {
			String url = "http://localhost:8080/DSS_P1/faces/home.xhtml";
			
			if(Desktop.isDesktopSupported()) {
				Desktop.getDesktop().browse(new URI(url));
			}
			return 0.0d;
		}
}
