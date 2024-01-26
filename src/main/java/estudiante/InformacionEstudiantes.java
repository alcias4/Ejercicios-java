package estudiante;



public class InformacionEstudiantes {
    public static void main(String[] args) {
        double [] calificaciones1   = {3.4, 4.0, 2.0,3.6};

        Estudiantes estudiante1 = new Estudiantes("Camilo andrade", 23,calificaciones1);


        // metodo prodemido = estudiante1.promedio();
        estudiante1.informacion();
    }
}
