package pooLocadoraDeCarros.pacoteDeNegócios.Aluguel;

public class Aluguel {
    private String ID; 
	private Carro carro;
	private Cliente cliente;
    private Int time;
    private Double finalPrice;
    private Boolean due;
	
	Aluguel(String ID,Carro carro,Cliente cliente,Int time,Double finalPrice,Boolean due) {
		this.ID = ID;
        this.carro = carro;
        this.cliente = cliente;
        this.time = time;
        this.finalPrice = finalPrice;
        this.due = due;
	}

    public void setID (String ID) {
        this.ID = ID;
    }
     public void setDue (Boolean due) {
        this.due = due;
    }
    public void setCarro (Carrocarro) {
        this.carro = carro;
    }
    public void setTime (Int time) {
        this.time = time;
    }
    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }
    public void setFinalPrice (Double finalprice) {
        this.finalprice = finalprice;
    }

    public void getID (String ID) {
        return this.ID ;
    }
     public void getDue (Boolean due) {
        return this.due ;
    }
    public void getCarro (Carrocarro) {
        return this.carro ;
    }
    public void getTime (Int time) {
        return this.time ;
    }
    public void getCliente (Cliente cliente) {
        return this.cliente ;
    }
    public void getFinalPrice (Double finalprice) {
        return this.finalprice ;
    }


	
	
	
}

