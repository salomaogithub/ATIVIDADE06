package classes;

public class Teste {

	public static void main(String[] args) {
		Moto moto = new Moto ("Yamaha");
		
		System.out.println(moto.getMarcaMoto());
		moto.revisado();
		
		System.out.println(moto.toString());
		
		System.out.println("Cilindro: Dm" + moto.getRPM());
		
		System.out.println("Motor: " + moto.getTipoMotor());
		
		System.out.println(moto.getPotencia() + " " + "Cavalos");
}




	

}
