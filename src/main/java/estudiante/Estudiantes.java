package estudiante;



public class Estudiantes {
    
    Estudiantes(String nombre, int edad, double[] listCalificaciones){
        this.nombre =nombre;
        this.edad = edad;
       
        this.listCalificaciones = listCalificaciones;
    }
    String nombre;
    int edad;
    double promedio;
    double [] listCalificaciones;
    


    void promedio (){
        double result = 0;
        for(int i =0; i < listCalificaciones.length; i++){
            result = result + listCalificaciones[i];
        }
        promedio = (result/listCalificaciones.length);
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("Tu promedio de nota es: " + promedio);
    }

    void informacion(){
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("---- Informacion del estudiante ----");
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Calificacion final : " + promedio);
    }


}
