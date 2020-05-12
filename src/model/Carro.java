package model;

public class Carro extends Veiculo {
	
	public Carro(String modelo, int ano, String placa) {
		super(modelo, ano, placa);
	}
	
	public void acelerar() {
		System.out.println("Vou acelerar o carro no pe");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + "]";
	}
	

}
