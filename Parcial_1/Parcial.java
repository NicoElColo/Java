import java.time.LocalDate;

public class Parcial{
    public static void main(String args[]){
        LocalDate fecha1 = LocalDate.of(2022, 03, 14);
        LocalDate fecha2 = LocalDate.of(2022, 04, 10);
        LocalDate fecha3 = LocalDate.of(2022, 03, 4);
        LocalDate fecha4 = LocalDate.of(2022, 02, 7);
        LocalDate fecha5 = LocalDate.of(2022, 07, 24);
        LocalDate fecha6 = LocalDate.of(2022, 06, 27);

        Cupon c1 = new Cupon("cupon 1", fecha1, null);
        Cupon c2 = new Cupon("cupon 2", fecha2, null);
        Cupon c3 = new Cupon("cupon 3", fecha3, null);
        Cupon c4 = new Cupon("cupon 4", fecha4, null);
        Cupon c5 = new Cupon("cupon 5", fecha5, null);

        UsuarioDTO user1 = new UsuarioDTO("user1", "perez", "manuel", "prueba1@gmail.com");
        UsuarioDTO user2 = new UsuarioDTO("user2", "brutti", "jimena", "prueba2@gmail.com");
        UsuarioDTO user3 = new UsuarioDTO("user3", "antelo", "raul", "prueba3@gmail.com");

        Facultad f1 = new Facultad("FICH");
        Facultad f2 = new Facultad("FBCB");


        RolComensalDTO com1 = new RolComensalDTO(user1, fecha6, "algo", f1);
        
    }
}