public class Docente {
    private Persona per;

    Docente(String nom, Integer dni){
        this.per = new Persona(nom,dni);
    }

    public void mostrar(){
        per.mostrar();
    }
}
