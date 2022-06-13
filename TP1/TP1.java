
import java.time.LocalDate;

public class TP1 {

	public static void main (String[] args) {

		Facultad fich = new Facultad("FICH");

		Carrer ing_inf = new Carrer("Ing. en Informatica");
		Carrer perito = new Carrer("Perito");

		Studient yo = new Studient("Nicolas Brutti", 43037092, LocalDate.of(2001,3,14),LocalDate.of(2019,1,10),ing_inf);
		Studient mazi = new Studient("Mazi que juega puyi", 41254875, LocalDate.of(1999,6,8),LocalDate.of(2018,9,18),ing_inf);

		Studient fran = new Studient("Fran Perez", 43256956, LocalDate.of(2000,7,25),LocalDate.of(2019,1,4),perito);

		ing_inf.addStudient(yo);
		ing_inf.addStudient(mazi);

		perito.addStudient(fran);


		fich.addCarrer(ing_inf);
		fich.addCarrer(perito);

		fich.ShowFac();

	}

}
