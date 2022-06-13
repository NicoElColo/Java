import java.time.LocalDate;

public class Studient {
	private
		Persone p;
		LocalDate insc;
		Carrer carrer;

	public
		Studient(String nom, Integer doc, LocalDate bday, LocalDate insc, Carrer carrer) {
			this.carrer = carrer;
			this.insc = insc;
			p = new Persone(nom,doc,bday);
		}

		void Show(){
			p.Show();
			System.out.println(insc.getDayOfMonth() + "/" + insc.getMonthValue() + "/" + insc.getYear());
		}
}