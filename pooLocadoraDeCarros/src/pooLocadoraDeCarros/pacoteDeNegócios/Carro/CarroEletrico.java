package pooLocadoraDeCarros.pacoteDeNegócios;

public class CarroEletrico extends Carro{
	
	private TipoDeCarro tipo;
	private TipoDeTomada tomada;
	private Int bateria;
	
	CarroEletrico  (String name,Double value,String placa,String modelo,Boolean automatico,TipoDeTomada tomada,Int bateria) {
		super(name,value,placa,modelo,automatico);
		this.tipo = TipoDeCarro.Elétrico;
		this.tomada = tomada;
		this.bateria = bateria;
	}

	public String getTipo() {
		return this.tipo.name();
	}
	public void setTipo(TipoDeCarro tipo) {
		this.tipo = tipo;
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
