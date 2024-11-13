package pooLocadoraDeCarros.pacoteDeNegócios.Carro;

public class Carro {
	private String name;
	private Double value;
	private String placa;
	private String modelo;
	private Boolean automatico;
	
	Carro(String name,Double value,String placa,String modelo,Boolean automatico) {
		this.name = name;
		this.value = value;
		this.placa = placa;
		this.modelo = modelo;
		this.automatico = automatico;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return this.Placa;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	public Double getValue() {
		return this.value;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getValue() {
		return this.value;
	}

	public void setAutomatico(Boolean automatico) {
		this.automatico = automatico;
	}
	public String getAutomatico() {
		return this.automatico;
	}
	
}

