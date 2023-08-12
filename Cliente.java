public class Cliente {
    private String nombre;
    private String email;
    private int cant_boletos;
    private int presupuesto;

    public Cliente(String nombre, String email, int cant_boletos, int presupuesto){
        this.nombre = nombre;
        this.email= email;
        this.cant_boletos=cant_boletos;
        this.presupuesto=presupuesto;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCant_boletos(int cant_boletos) {
        this.cant_boletos = cant_boletos;
    }
    public int getCant_boletos() {
        return cant_boletos;
    }
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    public int getPresupuesto() {
        return presupuesto;
    }
}
