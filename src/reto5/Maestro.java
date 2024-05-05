package reto5;

public class Maestro implements IUsuario {

    private int id = 0;
    private String nombre;
    private String apellido;
    private String correoElectronico;

    Maestro(int id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        
        System.out.println("Los datos del maestro se han guardado correctamente");
    }

    @Override
    public void imprimirPerfil() {
        System.out.println("Datos del maestro");        
        System.out.println("ID: " + this.id +
                "\n" +
                "Nombre: " + this.nombre +
                "\n" +
                "Apellido: " + this.apellido +
                "\n" +
                "Correo electronico: " + this.correoElectronico
        );
    }
    
}
