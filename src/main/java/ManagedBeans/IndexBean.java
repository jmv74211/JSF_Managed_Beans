package ManagedBeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="indexBean",eager=true)
@RequestScoped
public class IndexBean implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	private static String estadoActual = "APAGADO";
	
			
	private String textoEstadoMotor;
	
	private String colorEstadoMotor;
	
	private String textoBotonEncenderApagar;
	
	private String colorTextoBotonEncenderApagar;
	
	private String textoBotonAcelerarFrenar;
	
	private String colorTextoBotonAcelerarFrenar;

	private String colorPanelControl;
	
	private String textoAyuda;
	
	
	//GETTERS
	
	public String getTextoEstadoMotor(){
		if(this.textoEstadoMotor==null)
			return "Apagado";
		else	
			return this.textoEstadoMotor;
	}
	
	public String getColorEstadoMotor(){
		if(this.colorEstadoMotor==null)
			return "red";
		else	
			return this.colorEstadoMotor;
	}
	
	public String getTextoBotonEncenderApagar(){
		if(this.textoBotonEncenderApagar==null)
			return "Encender";
		else	
			return this.textoBotonEncenderApagar;
	}
	
	public String getColorTextoBotonEncenderApagar(){
		if(this.colorTextoBotonEncenderApagar==null)
			return "blue";
		else	
			return this.colorTextoBotonEncenderApagar;
	}
	
	
	public String getTextoBotonAcelerarFrenar(){
		if(this.textoBotonAcelerarFrenar==null)
			return "Acelerar";
		else	
			return this.textoBotonAcelerarFrenar;
	}
	
	public String getColorTextoBotonAcelerarFrenar(){
		if(this.colorTextoBotonAcelerarFrenar==null)
			return "black";
		else	
			return this.colorTextoBotonAcelerarFrenar;
	}
	
	
	public String getColorPanelControl(){
		if(this.colorPanelControl==null)
			return "#FAB4B4";
		else	
			return this.colorPanelControl;
	}
	
	public String getTextoAyuda(){
		if(this.textoAyuda==null)
			return "";
		else	
			return this.textoAyuda;
	}
	
	//SETTERS
	
	public void setTextoEstadoMotor(String nuevoEstado ){this.textoEstadoMotor=nuevoEstado;}
	
	public void setColorEstadoMotor(String nuevoEstado){ this.colorEstadoMotor=nuevoEstado;}
	
	public void setTextoBotonEncenderApagar(String nuevoEstado){ this.textoBotonEncenderApagar=nuevoEstado;}
	
	public void setColorTextoBotonEncenderApagar(String nuevoEstado){ this.colorTextoBotonEncenderApagar=nuevoEstado;}
	
	public void setTextoBotonAcelerarFrenar(String nuevoEstado){ this.textoBotonAcelerarFrenar=nuevoEstado;}
	
	public void setColorTextoBotonAcelerarFrenar(String nuevoEstado){ this.colorTextoBotonAcelerarFrenar=nuevoEstado;}
	
	public void setColorPanelControl(String nuevoEstado){ this.colorPanelControl=nuevoEstado;}
	
	public void setTextoAyuda(String nuevoEstado){ this.textoAyuda=nuevoEstado;}
	
	
	// ACTIONS LISTENERS
	
	public void accionBotonEncenderApagar(ActionEvent e) {
		
		if(this.estadoActual=="APAGADO") 
			this.motorEncendido();
			
		else if(this.estadoActual=="ENCENDIDO")
			this.motorApagado();
		
		else if(this.estadoActual=="ACELERANDO"){
			
			// Si está acelerando no realiza ninguna acción hasta que se frene
			this.acelerar();
			this.textoAyuda="Debe de frenar el motor para poder apagarlo";		
		}
		
	}
	
	public void accionBotonAcelerarFrenar(ActionEvent e) {
		
		if(this.estadoActual=="ENCENDIDO") 
			this.acelerar();
		
		else if(this.estadoActual=="ACELERANDO") 
			this.frenar();
		
		else
			this.textoAyuda="Debe de encender el motor para poder acelerar";
			
	}
	
	private void motorEncendido() {
		
		// Estado del motor
		this.textoEstadoMotor="Encendido";
		this.colorEstadoMotor="green";
		
		// Estado del botón encender-apagar
		
		this.textoBotonEncenderApagar="Apagar";
		this.colorTextoBotonEncenderApagar="blue";
		
		// Estado del botón acelerar-frenar
		this.textoBotonAcelerarFrenar="Acelerar";
		this.colorTextoBotonAcelerarFrenar="blue";
		
		// Estado del panel de control
		this.colorPanelControl="#B7FAB4";
		
		//Otros
		this.estadoActual="ENCENDIDO";
		this.textoAyuda="";
		
	}
	
	private void motorApagado() {
		
		// Estado del motor
		this.textoEstadoMotor="Apagado";
		this.colorEstadoMotor="red";
		
		// Estado del botón encender-apagar
		this.textoBotonEncenderApagar="Encender";
		this.colorTextoBotonEncenderApagar="blue";
		
		// Estado del botón acelerar-frenar
		this.textoBotonAcelerarFrenar="Acelerar";
		this.colorTextoBotonAcelerarFrenar="black";
		
		// Estado del panel de control
		this.colorPanelControl="#FAB4B4";
		
		//Otros
		this.estadoActual="APAGADO";
		this.textoAyuda="";
	}
	
	private void acelerar() {
		
		// Estado del motor
		this.textoEstadoMotor="Acelerando";
		this.colorEstadoMotor="blue";

		// Estado del botón encender-apagar
		this.textoBotonEncenderApagar="Apagar";	
		this.colorTextoBotonEncenderApagar="black";
		
		// Estado del botón acelerar-frenar
		this.textoBotonAcelerarFrenar="Frenar";
		this.colorTextoBotonAcelerarFrenar="blue";
		
		// Estado del panel de control
		this.colorPanelControl="#bde0f8";
		
		//Otros
		this.textoAyuda="";
		this.estadoActual="ACELERANDO";
	}
	
	private void frenar() {
		
		// Estado del motor
		this.textoEstadoMotor="Encendido";
		this.colorEstadoMotor="green";
		
		// Estado del botón encender-apagar
		this.textoBotonEncenderApagar="Apagar";
		this.colorTextoBotonEncenderApagar="blue";
		
		// Estado del botón acelerar-frenar
		this.textoBotonAcelerarFrenar="Acelerar";
		this.colorTextoBotonAcelerarFrenar="blue";
		
		// Estado del panel de control
		this.colorPanelControl="#B7FAB4";
		
		//Otros
		this.textoAyuda="";
		this.estadoActual="ENCENDIDO";
		
	}
	

}
