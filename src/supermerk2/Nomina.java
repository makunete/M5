package supermerk2;

public class Nomina {
	private Empleado []v;
	private int numEmp;
	
	public Nomina() {
		v=new Empleado[20];
		this.numEmp=0;
	}
	
	public Nomina(int num) {
		v=new Empleado[num];
		this.numEmp=0;
	}
	
	public void insereixEmpleat(Empleado e){
		if(this.numEmp<this.v.length) {
			v[this.numEmp]=e;
			this.numEmp++;
		}else
			System.out.println("No hay más capacidad.");
	}
	
	public void quantsCornella(){
		int i=0, suma=0;
		for(i=0;i<this.numEmp;i++) {
			if(v[i].getCiutat().equalsIgnoreCase("Cornella")) {
				suma++;
			}
		}
		System.out.println("Hay "+suma+" empleados viviendo en Cornella.");
	}
	
	public void costNomina() {
		int i=0;
		double suma=0;
		for(i=0;i<this.numEmp;i++) {
			suma=suma+v[i].getSalari();
		}
		System.out.println("El coste total de la nómina es de "+suma+" euros.");
	}
	
	public void quantesCaixeres(){
		int i=0, suma=0;
		for(i=0;i<this.numEmp;i++) {
			if(v[i].getLloc().equalsIgnoreCase("Cajero")) {
				suma++;
			}
		}
		System.out.println("Hay "+suma+" empleados trabajando en cajeros.");
	}
	
	public void eliminaNeteja(){
		int i=0, j=0;
		for(i=0;i<this.numEmp;i++) {
			if(v[i] instanceof Neteja) {
				for(j=i;j<=this.numEmp;j++) {
					v[j]=v[j+1];
				}
				this.numEmp--;
			}
		}
	}
	
	public void promigSou() {
		int i=0;
		double suma=0;
		for(i=0;i<this.numEmp;i++) {
			suma=suma+v[i].getSalari();
		}
		suma=suma/numEmp;
		System.out.println("El salario medio es de "+suma+" euros.");
	}

	public int getNumEmp() {
		return numEmp;
	}


}
