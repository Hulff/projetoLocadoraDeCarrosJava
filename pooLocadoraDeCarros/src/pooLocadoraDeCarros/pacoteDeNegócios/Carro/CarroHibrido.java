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
	public String getCombustivel() {
		return this.combustivel.name();
	}
	public void setCombustivel(TipoDeCombustivel combustivel) {
		this.combustivel = combustivel;
	}

	public String getTanque() {
		return this.tanque.name();
	}
	public void setTanque(Int tanque) {
		this.tanque = tanque;
	}
	public String getTomada() {
		return this.tomada.name();
	}
	public void setTomada(TipoDeTomada tomada) {
		this.tomada = tomada;
	}

	public String getBateria() {
		return this.bateria;
	}
	public void setBateria(Int bateria) {
		this.bateria = bateria;
	}
}
