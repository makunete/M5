package supermerk2;

public class Neteja extends Empleado {
	
	public Neteja(int opcion) {
		super(opcion);
		this.salariDiari();
	}

	@Override
	public void salariDiari() {
		// TODO Auto-generated method stub
		super.setSalari(35000);
	}
	
}
