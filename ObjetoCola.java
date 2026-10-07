

public class ObjetoCola {
    private String Nombre;
    private String Ubicacion;
    private int Problema;
    private int Tecnico;
    private int Prioridad;
    private int Estado;
 
    
    public ObjetoCola(String nombre, String ubicacion, int problema, int tecnico, int prioridad, int estado) {
        Nombre = nombre;
        Ubicacion = ubicacion;
        Problema = problema;
        Tecnico = tecnico;
        Prioridad = prioridad;
        Estado = estado;
    }
    public String getUbicacion() {
        return Ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }
    public int getProblema() {
        return Problema;
    }
    public void setProblema(int problema) {
        Problema = problema;
    }
    public int getTecnico() {
        return Tecnico;
    }
    public void setTecnico(int tecnico) {
        Tecnico = tecnico;
    }
    public int getPrioridad() {
        return Prioridad;
    }
    public void setPrioridad(int prioridad) {
        Prioridad = prioridad;
    }
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int estado) {
        Estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    
}
