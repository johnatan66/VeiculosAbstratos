package model;

public class Moto extends Veiculo {
	
	public Moto(String modelo, int ano, String placa) {
		super(modelo, ano, placa);
	}
	
	public void acelerar() {
		System.out.println("Vou acelerar a moto na m�o");
	}

	@Override
	public String toString() {
		return "Moto [modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + "]";
	}
	
	
}
