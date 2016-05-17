package supermerk2;

import java.util.Scanner;

public abstract class Empleado {
	private String nom;
	private String ciutat;
	private String lloc;
	private double salari;
	protected Scanner lector;
	
	public Empleado(int opcion) {
		lector=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		this.nom=lector.nextLine();
		System.out.println("Introduce tu ciudad:");
		this.ciutat=lector.nextLine();
		if(opcion==1) {
			this.lloc="Cajero";
		}
		else if(opcion==2) {
			this.lloc="Limpieza";
		}
		else if(opcion==3) {
			this.lloc="Mostrador";
		}
	}
	
	public String getCiutat() {
		return ciutat;
	}

	public void setSalari(double salari) {
		this.salari = salari;
	}

	public String getLloc() {
		return lloc;
	}
	
	public double getSalari() {
		return salari;
	}

	public abstract void salariDiari();

}
