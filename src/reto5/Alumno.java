package reto5;

public class Alumno implements IUsuario, ICalificaciones {
    private int id = 0;
    private String nombre = "";
    private  String apellido;
    private double calificacion = 0.0;
    private  String correoElectronico;
    
    Alumno(int id, String nombre, String apellido, double calificacion, String correoElectronico){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion += calificacion;
        this.correoElectronico = correoElectronico;
        
        System.out.println("Los datos del alumno se han guardado correctamente");
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public void imprimirPerfil(){
        System.out.println("Datos del alumno");
        System.out.println("ID: " + this.id +
                "\n" +
                "Nombre: " + this.nombre +
                "\n" +
                "Apellido: " + this.apellido + 
                "\n" +
                "Correo Electronico: " + this.correoElectronico
        );
    }
    
    @Override
    public double mostrarCalificaciones(){
        return this.calificacion;
    }
    
    
    public void guardarCalificacion(double calificacion){
        System.out.println("Se esta agregado el " + calificacion + " al promedio");
        this.calificacion = (this.calificacion + calificacion)/2;
        System.out.println("El nuevo promedio de la calificacion es: " + this.calificacion);
    }
}
