package reto5;

public class Tutor implements IUsuario, ICalificaciones {
    
    private int id = 0;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String alumno;
    private double calificacion;

    Tutor(int id, String nombre, String apellido, String correoElectronico, String alumno, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.alumno = alumno;
        this.calificacion = calificacion;
        
        System.out.println("Los datos del tutor se han guardado correctamente");
    }
    
    @Override
    public void imprimirPerfil(){
        System.out.println("Datos del tutor");        
        System.out.println("ID: " + this.id +
                "\n" +
                "Nombre: " + this.nombre +
                "\n" +
                "Apellido: " + this.apellido +
                "\n" +
                "Correo electronico: " + this.correoElectronico +
                "\n" +
                "Alumno: " + this.alumno
        );
    }
    
    @Override
    public double mostrarCalificaciones(){
        return this.calificacion;
    }
    
}
