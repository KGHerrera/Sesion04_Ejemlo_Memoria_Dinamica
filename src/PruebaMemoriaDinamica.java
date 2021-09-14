import java.util.Scanner;

public class PruebaMemoriaDinamica {
	public static void main(String[] args) {
		//Pedir los datos de los Aspirantes
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		String nombre = "Madeline";
		String primerAp = "Diane";
		String segundoAP = "";
		byte edad = 17;
		String direccion = "Celeste";
		String telefono = "01010101";
		String correosElectronicos[] = {"madeline.correo","madelin.gmail","madeline.Yahoo"};
		String redesSociales[] = {"01","02","03"};
		String carrerasInteres[] = {"ISC", "IM"};
		String escuelaProcedencia = "Cetis";
		String bachillerato = "Fisica";
		*/
		
		//Aspirante asp1 = new Aspirante(nombre, primerAp, segundoAP, edad, direccion, telefono, correosElectronicos, redesSociales, carrerasInteres, escuelaProcedencia, bachillerato);
		
		RegistroAspirantes ra = new RegistroAspirantes();
		
		int opcion = 0;
		do {
			System.out.println("\nElije opcion: ");
			System.out.println("1) Agregar usuario");
			System.out.println("2) eliminar usuario");
			System.out.println("3) Mostrar usuarios");
			System.out.println("4) Salir");
			System.out.println("Introduce opcion: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:	
				System.out.println("\nIntroduce datos");
				System.out.println("nombre: ");
				String nombre = entrada.next();
				System.out.println("Apellido Paterno: ");
				String primerAp = entrada.next();
				System.out.println("Apellido Materno: ");
				String segundoAp = entrada.next();
				System.out.println("edad: ");
				byte edad = entrada.nextByte();
				System.out.println("Direccion: ");
				String direccion = entrada.next();
				System.out.println("Telefono: ");
				String telefono = entrada.next();
				
				System.out.println("numero de Correos electronicos: ");
				int numeroCorreos = entrada.nextInt();
				String []correosElectronicos = new String[numeroCorreos];
				for(int j = 0; j < correosElectronicos.length; j++) {
					System.out.println("Introduce correo " + (j+1) + ": ");
					correosElectronicos[j] = entrada.next();
				}
				
				System.out.println("numero de Redes sociales: ");
				int numeroSociales = entrada.nextInt();
				String []redesSociales = new String[numeroSociales];
				for(int j = 0; j < redesSociales.length; j++) {
					System.out.println("Introduce red social " + (j+1) + ": ");
					redesSociales[j] = entrada.next();
				}
				
				System.out.println("numero de Carreras de interes: ");
				int numeroCarreras = entrada.nextInt();
				String []carrerasInteres = new String[numeroCarreras];
				for(int j = 0; j < carrerasInteres.length; j++) {
					System.out.println("Introduce carrera " + (j+1) + ": ");
					carrerasInteres[j] = entrada.next();
				}
				
				System.out.println("Escuela de procedencia: ");
				String escuelaProcedencia = entrada.next();
				System.out.println("Bachillerato: ");
				String bachillerato = entrada.next();
				String folio = ra.generarFolio();
				Aspirante asp1 = new Aspirante(folio, nombre, primerAp, segundoAp, edad, direccion, telefono, correosElectronicos, redesSociales, carrerasInteres, escuelaProcedencia, bachillerato);
				ra.registrarAspirante(asp1);
				break;
			case 2:
				System.out.println("\nIntroduce folio: ");
				String folioBorrar = entrada.next();
				ra.eliminarAspirante(folioBorrar);
				break;
			case 3:
				ra.imprimirListaAspirantes();
				break;
			case 4:
				System.out.println("Saliendo . . .");
				break;
				
			default:
				break;
			}
		}while (opcion != 4);
		
	}
}
