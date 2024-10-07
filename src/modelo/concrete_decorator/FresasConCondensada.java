package modelo.concrete_decorator;

import modelo.component.FresasComponent;
import modelo.decorator.FresasDecorator;

public class FresasConCondensada extends FresasDecorator {
	private double precio;
	private String descripcion;
	
	public FresasConCondensada(FresasComponent envuelto) {
		super(envuelto);
		this.precio=200.00;
		this.descripcion="Con Leche Condensada";
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
