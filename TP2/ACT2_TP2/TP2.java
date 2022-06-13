import java.time.LocalDate;

public class TP2 {
    public static void main(String[] args){
        Jefe bs = new Jefe("jefazo", "de tal", 30985654,"a la vuelta",2500.f);
        Categoria cat = new Categoria("Elpi", 700.f);
        Mensualizado pana = new Mensualizado("Brother", "Pana", 43037092, "calle falsa 123",cat, bs);
        Jornalizados esclavo = new Jornalizados("Brother", "Pana", 43037092, "calle falsa 123", bs);

        esclavo.addJornada(LocalDate.of(2000,5,23), 8);

        Empresa fich = new Empresa();
        LocalDate desde = LocalDate.of(1998, 3, 15);
        LocalDate hasta = LocalDate.of(2001, 1, 5);

        Periodo p = new Periodo(desde, hasta);

        LocalDate desde2 = LocalDate.of(1999, 7, 1);
        LocalDate hasta2 = LocalDate.of(2000, 6, 23);

        Periodo p2 = new Periodo(desde2, hasta2);

        fich.addReg(p, 50.f, 70.f);

        fich.addTraba(pana);
        fich.addTraba(esclavo);
        fich.addTraba(bs);
        fich.mostrar();
        fich.pagar_sueldos(p2);
        fich.listarEmpleadosPorJefe(bs);
    }
}