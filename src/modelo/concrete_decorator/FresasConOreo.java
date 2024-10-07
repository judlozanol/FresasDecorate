package modelo.concrete_decorator;

import modelo.component.FresasComponent;
import modelo.decorator.FresasDecorator;

public class FresasConOreo extends FresasDecorator {
	private double precio;
	private String descripcion;
	
	public FresasConOreo(FresasComponent envuelto) {
		super(envuelto);
		this.precio=300.00;
		this.descripcion="Con Oreo";
	}

	@Override
	public double obtenerPrecio() {
		return super.obtenerPrecio() + precio;
	}

	@Override
	public String obtenerDescripcion() {
		return super.obtenerDescripcion() + "; " + descripcion ;
	}
}
