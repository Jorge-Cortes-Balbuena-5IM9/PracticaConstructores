package practicauno;


public class Cons{
    String NombreApp;
    String Clasificacion;
    String Desarrollador;
    int edadminima;
    int costo;
    public Cons(String NombreApp){
    this.NombreApp=NombreApp;
    }
    public Cons(String NombreApp,String Clasificacion){
    this.NombreApp=NombreApp;
    this.Clasificacion=Clasificacion;
    }
    public Cons(String NombreApp,String Clasificacion,int edadminima){
    this.NombreApp=NombreApp;
    this.Clasificacion=Clasificacion;
    this.edadminima=edadminima;
    }
    public Cons(String NombreApp,String Clasificacion,int edadminima,int costo){
    this.NombreApp=NombreApp;
    this.Clasificacion=Clasificacion;
    this.edadminima=edadminima;
    this.costo=costo;
    }
    public Cons(String NombreApp,String Clasificacion,int edadminima,int costo, String Desarrollador){
    this.NombreApp=NombreApp;
    this.Clasificacion=Clasificacion;
    this.edadminima=edadminima;
    this.costo=costo;
    this.Desarrollador=Desarrollador;
    }

    public String getNombreApp() {
        return NombreApp;
    }

    public void setNombreApp(String NombreApp) {
        this.NombreApp = NombreApp;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public void setDesarrollador(String Desarrollador) {
        this.Desarrollador = Desarrollador;
    }

    public int getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(int edadminima) {
        this.edadminima = edadminima;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public abstract class Mensaje{
        String IMensaje;
        char respuesta;
    }
    public class ConfirmaDescarga extends Mensaje{
    char respuesta='s';
    {
    System.out.println(respuesta);
    }
    }
    
    public class MuestraMensaje extends Mensaje{
    String IMensaje="Programa desacargado";
    {
        System.out.println(IMensaje);
    }
    }
    
    
    
}