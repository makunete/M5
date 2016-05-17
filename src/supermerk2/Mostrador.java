package supermerk2;

public class Mostrador extends Empleado {
	
	private double vendes;
	
	public Mostrador(int opcion){
		super(opcion);
		System.out.println("Introduce la cantidad obtenida en ventas:");
		this.vendes=lector.nextDouble();
		this.salariDiari();
	}
	
	@Override
	public void salariDiari() {
		// TODO Auto-generated method stub
		super.setSalari(50000+vendes*0.15);//He entendido que al salario se le suma el 15% de lo obtenido con las ventas
	}

}
