package interceptor;

public interface Filtro {
	int INTERVALO = 25;
	int RADIO = 10;

	public double ejecutar(Object peticion);		
}
