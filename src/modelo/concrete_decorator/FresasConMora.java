package modelo.concrete_decorator;

import modelo.component.FresasComponent;
import modelo.decorator.FresasDecorator;

public class FresasConMora extends FresasDecorator {
	private double precio;
	private String descripcion;
	
	public FresasConMora(FresasComponent envuelto) {
		super(envuelto);
		this.precio=250.00;
		this.descripcion="Con Salsa de Mora";
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
