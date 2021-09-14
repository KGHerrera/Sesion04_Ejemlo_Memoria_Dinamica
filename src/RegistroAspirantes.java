import java.util.ArrayList;
import java.util.Iterator;

public class RegistroAspirantes {
	private ArrayList listaAspirantes;
	
	public RegistroAspirantes() {
		listaAspirantes = new ArrayList();
	}
	
	public void registrarAspirante(Aspirante a) {
		listaAspirantes.add(a);
		System.out.println("\n>> Aspirante registrado correctamente");
	}
	
	public void eliminarAspirante(String folio) {
		//listaAspirantes.remove(listaAspirantes.size()-1); //Elimina el ultimo
		//listaAspirantes.remove(listaAspirantes.size()-1);
		//Recorrer la lista para buscar el elemento y eliminarlo
		if(!(listaAspirantes.isEmpty())) {
			for (Object a : listaAspirantes) {
				if (((Aspirante)a).getFolio().equals(folio)) {
					listaAspirantes.remove(a);
					System.out.println("\n>> Aspirante eliminado correctamente");
					break;
				}
			}
		}else {
			System.out.println("\n>> Lista vacia");
		}
		
		
	}
	
	public String generarFolio() {
		String folio = "";
		
		if(listaAspirantes.isEmpty()) {
			folio = "00" + 1;
		} else {
			int folioAnterior = Integer.parseInt(((Aspirante)listaAspirantes.get(listaAspirantes.size()-1)).getFolio());
			if ((folioAnterior + 1) <= 9) {
				folio += "00" + (folioAnterior + 1);
			} else if ((folioAnterior + 1) >= 10 && (folioAnterior + 1)  <= 99) {
				folio += "0" + (folioAnterior + 1);
			} else {
				folio += (folioAnterior + 1);
			}
		}
		return folio;
	}
	
	public void imprimirListaAspirantes() {
		//Recorrer la lista para mostrar los elementos
		// Recorrido de un ArrayList
		/*
		// Forma 1 con un ciclo normal FOR
		for(int i = 0; i < listaAspirantes.size(); i++) {
			System.out.println(listaAspirantes.get(i));
			
			//System.out.println(((Aspirante)listaAspirantes.get(i)).getNombre());
		}
		//Forma 2 con un objeto de la clase ITERATOS
		System.out.println("Recorrido con iterator");
		Iterator i = listaAspirantes.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			System.out.println(((Aspirante)i.next()).getNombre());
		}
		*/
		// Forma 3 con un Enegment For (For mejorado o for each) 
		if(!(listaAspirantes.isEmpty())) {
			System.out.println("\n>>> Aspirantes");
			for (Object a : listaAspirantes) {
				System.out.println(((Aspirante)a));
			}
		}else {
			System.out.println("\n>> Lista vacia");
		}
		
	}
	
}
