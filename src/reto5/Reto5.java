// Reto 5 Proyecto final del paradigma orientado a objetos
// Nombre completo: Francisco Samuel Arrieta Tavares
// Fecha de elaboración: 28 de julio del 2021
// Nombre del modulo: Programacion orientada a objetos
// Nombre del asesor: Julio César Mosqueda Gómez
package reto5;

public class Reto5 {

    public static void main(String[] args) {
        // Maestro
        Maestro maestro = new Maestro(18, "Julio", "Mosqueda", "julio@correo.com");
        maestro.imprimirPerfil();
        
        // Separador
        System.out.println("");
        
        // Alumno
        Alumno alumno = new Alumno(21, "Samuel", "Arrieta", 8.7, "samuel@correo.com");
        alumno.imprimirPerfil();
        System.out.println("La calificacion del alumno es: " + alumno.mostrarCalificaciones());
        alumno.guardarCalificacion(8.9);
        
        // Separador
        System.out.println("");
        
        // Tutor
        Tutor tutor = new Tutor(9, "Sandra", "Torres", "sandra@correo.com", alumno.getNombre(), alumno.mostrarCalificaciones());
        tutor.imprimirPerfil();
        System.out.println("La calificacion del alumno es: " + tutor.mostrarCalificaciones());
        
    }
    
}
