import java.util.ArrayList;

public class Facultad {
	private
		ArrayList<Carrer> Carrers;
		String nom;

	public
		Facultad(String nom) {
			this.nom = nom;
			Carrers = new ArrayList<Carrer>();
		}

		void addCarrer(Carrer x) {
			Carrers.add(x);
		}

		void ShowFac(){
			System.out.print("Facultad: ");
			System.out.println(nom);
			Integer car = 0;
			while (car < Carrers.size()) {
				Carrer aux = Carrers.get(car);
				System.out.print("Carrera: ");
				System.out.println(aux.getNom());
				System.out.println("Alumnos: ");
				aux.ShowStudients();
				car++;
			}
		}


}