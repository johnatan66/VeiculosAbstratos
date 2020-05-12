package model;

public abstract class Veiculo {
	protected String modelo;
	protected int ano;
	protected String placa;
	
	
	public Veiculo(String modelo, int ano, String placa) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}
	// condiçoes minimas para definir como os filhos devem ser criados, logo todo filho da classe veiculos deve ter acelerar
	public abstract void acelerar();
	
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + "]";
	}

}
