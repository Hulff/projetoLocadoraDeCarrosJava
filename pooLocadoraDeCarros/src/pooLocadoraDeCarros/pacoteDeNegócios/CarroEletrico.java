package pooLocadoraDeCarros.pacoteDeNegócios;

public class CarroEletrico extends Carro{
	
	private tiposDeCarro tipo;
	
	CarroEletrico (String name,Double value) {
		super(name,value);
		this.tipo = tiposDeCarro.Elétrico;
	}
	public String getTipo() {
		return this.tipo.name();
	}
	public void setTipo(tiposDeCarro tipo) {
		this.tipo = tipo;
	}
}
