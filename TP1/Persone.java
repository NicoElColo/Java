import java.time.LocalDate;

public class Persone {
	private
		Integer doc;
		String nom;
		LocalDate bday;
		String pass;

	public
		Persone(String nom, Integer doc, LocalDate bday) {
			this.doc = doc;
			this.nom = nom;
			this.bday = bday;
		}

		Integer CalculateAge(){
			LocalDate hoy = LocalDate.now();
			if (hoy.getDayOfYear() < bday.getDayOfYear()) {
				return (hoy.getYear() - bday.getYear() -1);
			}
			return (hoy.getYear() - bday.getYear());
		}
		
		Boolean val_pass(String pass) {
			String claveSHA = StringMD.getStringMessageDigest(pass, StringMD.SHA256);
			return (claveSHA.equals(pass));
		}
		
		void Show(){
			System.out.print(nom + " - ");
		}

}