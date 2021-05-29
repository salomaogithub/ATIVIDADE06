package classes;

import interfaces.Cilindro;
import interfaces.Marca;
import interfaces.Motor;

public class Moto implements Marca, Cilindro, Motor {
	private String marca;
	private int potencia;
	boolean revisado;
	
	public Moto(String marca) {
		
		this.setMarca(marca);
		this.setPotencia(4);
		this.setRevisado(false);
		
	}

	private void setRevisado(boolean b) {
		
		
	}

	private void setMarca(String marca2) {
		
		
	}

	@Override
	public String getTipoMotor() {
		return "VM8cv";
	}

	@Override
	public String getTipoAro() {
		
		return "18";
	}

	@Override
	public int getpotencia() {
		
		return 50;
	}

	@Override
	public String getservico() {
		
		System.out.println("Notbook carregado!");
		this.setRevisado(true);
		this.setPotencia(100);
		return marca;
	}

	@Override
	public int getRPM() {
		
		return 700;
	}

	@Override
	public String getMarcaMoto() {
		
		return "Yamaha";
	}

	@Override
	public String getCilindradaMoto() {
		
		return "4tempos";
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void revisado() {
		
		
	}
	
	

}
