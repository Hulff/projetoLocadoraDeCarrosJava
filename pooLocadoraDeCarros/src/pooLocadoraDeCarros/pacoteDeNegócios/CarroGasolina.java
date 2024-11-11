package pooLocadoraDeCarros.pacoteDeNegócios;

public class CarroGasolina extends Carro{
	
	private tiposDeCarro tipo;
	
	CarroGasolina (String name,Double value) {
		super(name,value);
		this.tipo = tiposDeCarro.Gasolina;
	}
	public String getTipo() {
		return this.tipo.name();
	}
	public void setTipo(tiposDeCarro tipo) {
		this.tipo = tipo;
	}
}
