public interface IRepositorioCarros {
    public abstract void addCarroDisponivel(Carro carro);
    public abstract void addCarroIndisponivel(Carro carro);
    void deleteCarro(String placa);
    void updateCarro(Carro carro);
    Carro getCarro(String placa);

}