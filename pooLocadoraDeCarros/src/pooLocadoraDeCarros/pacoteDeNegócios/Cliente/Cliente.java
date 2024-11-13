package pooLocadoraDeCarros.pacoteDeNegócios.Cliente;

public class Cliente {
    private String CPF; 
	private String name;
	private Boolean alugou;
	
	Cliente(String name,String CPF,Boolean alugou,) {
		this.name = name;
		this.CPF = CPF;
		this.alugou = alugou;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getCPF(String CPF) {
        return this.CPF;
    }

    public void setAlugou(String alugou) {
        this.alugou = alugou;
    }
    public String getAlugou(String alugou) {
        return this.alugou;
    }

	
	
}

