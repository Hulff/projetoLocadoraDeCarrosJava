package pooLocadoraDeCarros.pacoteDeNegócios;

public class Carro {
	private String name;
	private Double value;
	private String ID;
	
	Carro(String name,Double value) {
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return this.value;
	}
	public void setName(Double value) {
		this.value = value;
	}
	public String getID() {
		return this.ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
}

