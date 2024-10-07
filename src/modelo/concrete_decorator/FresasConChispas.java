package modelo.concrete_decorator;

import modelo.component.FresasComponent;
import modelo.decorator.FresasDecorator;

public class FresasConChispas extends FresasDecorator {
	private double precio;
	private String descripcion;
	
	public FresasConChispas(FresasComponent envuelto) {
		super(envuelto);
		this.precio=150.00;
		this.descripcion="Con Chispas";
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
