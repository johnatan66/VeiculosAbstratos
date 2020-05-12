import model.Carro;
import model.Moto;
import model.Veiculo;

public class MainClass {
	public static void main(String args[]) {
		Veiculo v1, v2;
		
		v1 = new Carro("Evoque", 2020, "ABC1234");
		v2 = new Moto("Ninja", 2020, "XYZ9876");
		
		v1.acelerar();
		v2.acelerar();
		
		System.out.println(v1);
		System.out.println(v2);
				
	}

}
