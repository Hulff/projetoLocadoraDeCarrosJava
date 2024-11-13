package pooLocadoraDeCarros.pacoteDeNegócios.Funcionario;

public class Funcionario {
    private String CPF; 
	private String name;
	private Int senha;
	
	Funcionario(String name,String CPF,Int senha) {
		this.name = name;
		this.CPF = CPF;
		this.senha = senha;
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

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha(String senha) {
        return this.senha;
    }

	
	
}

