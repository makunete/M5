package supermerk2;

public class Caixer extends Empleado {
	
	private int horesTreballades;
	
	public Caixer(int opcion) {
		super(opcion);
		System.out.println("Introduce la cantidad de horas trabajadas:");
		this.horesTreballades=lector.nextInt();
		this.salariDiari();
	}

	@Override
	public void salariDiari() {
		// TODO Auto-generated method stub
		super.setSalari(15000*this.horesTreballades);

	}

	public int getHoresTreballades() {
		return horesTreballades;
	}

}
