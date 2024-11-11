package pooLocadoraDeCarros.pacoteDeDados;
import java.util.ArrayList;
import java.util.Iterator;

import pooLocadoraDeCarros.pacoteDeNegócios.Carro;

public class RepositorioCarros {
	private ArrayList<Carro> listaCarrosDisponiveis; 
	private ArrayList<Carro> listaCarrosLocados;
	
	RepositorioCarros() {
		this.listaCarrosDisponiveis = new ArrayList<Carro>();
		this.listaCarrosLocados = new ArrayList<Carro>();
		
	}
	
	public void addCarroDisponivel(Carro car) {
		this.listaCarrosDisponiveis.add(car);
	}
	public void locarCarro(String ID) {
		
		for (int i = 0; i < listaCarrosDisponiveis.size();i++ ) {
			// buscar o carro com o id 
			
		}
	}
	
}
