package pooLocadoraDeCarros.pacoteDeNegócios;

public class CarroHibrido extends Carro{
	
	private tiposDeCarro tipo;
	
	CarroHibrido (String name,Double value) {
		super(name,value);
		this.tipo = tiposDeCarro.Híbrido;
	}
	public String getTipo() {
		return this.tipo.name();
	}
	public void setTipo(tiposDeCarro tipo) {
		this.tipo = tipo;
	}
}
