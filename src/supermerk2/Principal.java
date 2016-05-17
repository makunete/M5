package supermerk2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		Scanner lector=new Scanner(System.in);
		Nomina n=new Nomina();
		Empleado e;
		
		do {
			System.out.println("1.- Introducir cajero/a");
			System.out.println("2.- Introducir empleado/a de limpieza");
			System.out.println("3.- Introducir empleado/a de mostrador");
			System.out.println("4.- Eliminar empleados/as de limpieza");
			System.out.println("5.- Cantidad de personas de Cornella");
			System.out.println("6.- Coste de la nomina diaria");
			System.out.println("7.- Cantidad de cajeros/as en nomina");
			System.out.println("8.- Salario medio de los empleados");
			System.out.println("9.- Salir");
			opcion=lector.nextInt();
			
			switch(opcion) {
						case 1: e =new Caixer(opcion);
								n.insereixEmpleat(e);
								break;
						case 2: e =new Neteja(opcion);
								n.insereixEmpleat(e);
								break;
						case 3: e =new Mostrador(opcion);
								n.insereixEmpleat(e);
								break;
						case 4: n.eliminaNeteja();
								break;
						case 5: n.quantsCornella();
								break;
						case 6: n.costNomina();
								break;
						case 7: n.quantesCaixeres();
								break;
						case 8: n.promigSou();
								break;
						case 9: System.out.println("Cerrando programa...");
								break;
						default: System.out.println("Valor no válido.");
			}
			
		}while(opcion<9 || opcion>9);
		lector.close();
	}

}
