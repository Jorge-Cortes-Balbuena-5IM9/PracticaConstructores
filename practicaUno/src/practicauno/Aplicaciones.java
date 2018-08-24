package practicauno;

public class Aplicaciones {
    public static void main(String[] args) {
        Cons app1 = new Cons("Aplicacion1");
        Cons app2 = new Cons("Aplicadcion 2","Red social");
        Cons app3 = new Cons("Aplicacion 3", "Juego",3);
        Cons app4 = new Cons("Aplicacion 4", "Realidad Virtual", 10, 0);
        Cons app5 = new Cons("Aplicacion 5", "Recreativo" , 3, 100, "Virtual Gear");
        System.out.println("Los datos de la app1 son: Nombre: " + app1.getNombreApp());
        System.out.println("Los datos de la app2 son: Nombre: " + app2.getNombreApp() + ", Clasificacion: " + app2.getClasificacion());
        System.out.println("Los datos de la app3 son: Nombre: " + app3.getNombreApp() + ", Clasificacion: " + app3.getClasificacion() + ", Edad minima: " + app3.getEdadminima());
        System.out.println("Los datos de la app4 son: Nombre: " + app4.getNombreApp() + ", Clasificacion: " + app4.getClasificacion() + ", Edad minima: " + app4.getEdadminima() + ", Costo: " + app4.getCosto());
        System.out.println("Los datos de la app5 son: Nombre: " + app5.getNombreApp() + ", Clasificacion: " + app5.getClasificacion() + ", Edad minima: " + app5.getEdadminima() + ", Costo: " + app5.getCosto() + ", Desarrolador: " + app5.getDesarrollador());
    }
    
}
