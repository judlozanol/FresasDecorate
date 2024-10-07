package modelo.decorator;

import modelo.component.FresasComponent;

public class FresasDecorator implements FresasComponent {
	private FresasComponent envuelto;
	
	public FresasDecorator(FresasComponent envuelto) {
		this.envuelto=envuelto;
	}
	@Override
	public double obtenerPrecio() {
		return this.envuelto.obtenerPrecio();
	}

	@Override
	public String obtenerDescripcion() {
		return this.envuelto.obtenerDescripcion();
	}

}
