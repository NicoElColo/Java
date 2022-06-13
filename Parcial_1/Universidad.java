import java.util.Vector;

public class Universidad {
    private String nombre;
    private Vector<Facultad> faqs;
    private Vector<ComedorDTO> comedores;
    private Vector<UsuarioDTO> users;

    public Universidad(String nom){
        this.nombre = nom;
        this.faqs = new Vector<Facultad>();
        this.comedores = new Vector<ComedorDTO>();
        this.users = new Vector<UsuarioDTO>();
    }

    public void addFacu(Facultad facu){
        faqs.add(facu);
    }

    public void addCome(ComedorDTO com){
        comedores.add(com);
    }

    public void addUser(UsuarioDTO us){
        users.add(us);
    }

    public void listarComensales(){
        for(UsuarioDTO us : users){
            us.listarComensales();
        }
    }
}
