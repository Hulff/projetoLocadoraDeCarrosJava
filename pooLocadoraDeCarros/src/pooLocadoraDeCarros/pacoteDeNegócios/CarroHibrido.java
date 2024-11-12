package pooLocadoraDeCarros.pacoteDeNegócios;

public class CarroHibrido extends Carro{
	
	private TipoDeCarro tipo;
	private TipoDeCombustivel combustivel;
	private Int tanque;
	private TipoDeTomada tomada;
	private Int bateria;
	// implementar get e setters
	CarroHibrido  (String name,Double value,String placa,String modelo,Boolean automatico) {
		super(name,value,placa,modelo,automatico);
		this.tipo = TipoDeCarro.Híbrido;
	}
	public String getTipo() {
		return this.tipo.name();
	}
	public void setTipo(TipoDeCarro tipo) {
		this.tipo = tipo;
	}
}
