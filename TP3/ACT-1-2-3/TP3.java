import java.time.LocalDate;

public class TP3 {
    public static void main(String args[]){
        LocalDate cur = null;
        LocalDate ing1 = LocalDate.of(2016, 4, 13);
        LocalDate ing2 = LocalDate.of(2015, 3, 21);
        LocalDate ing3 = LocalDate.of(2014, 6, 3);
        LocalDate ing4 = LocalDate.of(2013, 1, 15);
        LocalDate ing5 = LocalDate.of(2012, 8, 25);

        LocalDate eg1 = LocalDate.of(2018, 4, 8);
        LocalDate eg2 = LocalDate.of(2019, 9, 12);
        LocalDate eg3 = LocalDate.of(2020, 6, 3);

        Alumno a1 = new Alumno(ing1, cur, "pedrito", 43037092);
        Alumno a2 = new Alumno(ing2, eg3, "ramon", 22645823);
        Alumno a3 = new Alumno(ing3, eg2, "juana", 35698524);
        Alumno a4 = new Alumno(ing4, cur, "camila", 12321456);
        Alumno a5 = new Alumno(ing5, eg1, "fede", 48566922);

        Carrera iinf = new Carrera("Ing en info.");
        iinf.addAl(a1);
        iinf.addAl(a2);
        iinf.addAl(a3);
        iinf.addAl(a4);
        iinf.addAl(a5);

        iinf.listar_egresados();

        Catedra calc = new Catedra("Calculo");
        Catedra fupro = new Catedra("FuPro");

        Docente mario = new Docente("mario", 11546851);
        Docente pablito = new Docente("pablo", 32854895);

        LocalDate com1 = LocalDate.of(2021, 4, 8);
        LocalDate com2 = LocalDate.of(2022, 11, 23);

        Comision c1 = new Comision('A', com1, mario);
        Comision c2 = new Comision('B', com2, pablito);

        c1.addAl(a1);
        c2.addAl(a2);
        c1.addAl(a3);
        c2.addAl(a4);
        c1.addAl(a5);

        calc.addCom(c1);
        fupro.addCom(c2);

        Facultad fich = new Facultad("FICH");

        iinf.addCat(calc);
        iinf.addCat(fupro);

        fich.addCarrera(iinf);

        Universidad unl = new Universidad("UNL");

        unl.addFac(fich);
        System.out.println("");
        unl.listarAlumnos(fupro);
        System.out.println("");
        unl.listarAlumnos(calc);


    }
}