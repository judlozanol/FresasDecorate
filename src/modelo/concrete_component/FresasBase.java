package modelo.concrete_component;

import modelo.component.FresasComponent;

public class FresasBase implements FresasComponent {
	private double precio;
	private String descripcion;
	
	public FresasBase(double precio) {
		this.precio= precio ;
		this.descripcion="Fresas con Crema";
	}
	
	@Override
	public double obtenerPrecio(){
		return precio;
	}

	@Override
	public String obtenerDescripcion(){
		return "Descripcion: " + descripcion;
	}

}
