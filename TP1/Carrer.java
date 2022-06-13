import java.util.ArrayList;

public class Carrer {
	private
		String nom;
		ArrayList<Studient> studients;
		
	public
		Carrer(String nom) {
			this.nom = nom;
			studients = new ArrayList<Studient>();
		}
		
		void addStudient(Studient s){
			studients.add(s);
		}

		void ShowStudients() {
			Integer cont = 0;
			do {
				Studient p = studients.get(cont);
				System.out.print("          ");
				p.Show();
				cont++;
			} while (cont < studients.size());
		}

		String getNom() {
			return nom;
		}
}